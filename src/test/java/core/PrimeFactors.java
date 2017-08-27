package core;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

	
	long n;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number:");

	n = sc.nextLong();
	sc.close();
	System.out.print("Prime Factors are: ");
	for (int i = 2; i <= n; i++) {
	    while (n % i == 0) {
		System.out.print(i + " ");
		n /= i;
	    }
	}
	
    }
}
