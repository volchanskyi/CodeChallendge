package core;

import java.util.Scanner;

public class MegaPrimeNumbers {

    public static boolean isPrime(int number) {
	if (number <= 1) {
	    return false;
	}
	if (number == 2) {
	    return true;
	}
	if (number % 2 == 0) {
	    return false;
	}
	for (int i = 2; i < number; i++) {
	    if (number % i == 0) {
		return false;
	    }
	}
	return true;
    }

    public static boolean isMegaPrime(int number) {
	if (number < 10) {
	    return false;
	}
	String s = Integer.toString(number);
	String prime_number_a[] = s.split("");
	for (String mega_prime : prime_number_a) {
	    if (!isPrime(Integer.parseInt(mega_prime))) {
		return false;
	    }

	}
	return true;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	input.close();
	System.out.print("MegaPrimes are: ");
	for (int i = 1; i <= number; i++) {
	    if (isPrime(i) && isMegaPrime(i)) {
		System.out.print(i + ", ");
	    }
	}
    }
}
