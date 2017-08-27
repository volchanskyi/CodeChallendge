package core;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();
	System.out.print("Prime numbers are: ");

	// Start coding

	System.out.println("Generate Prime numbers between 2 and " + number);

	// loop through the numbers one by one
	for (int i = 2; i < number; i++) {
	    boolean isPrimeNumber = true;

	    // check to see if the number is prime

	    for (int j = 2; j < i; j++) {
		if (i % j == 0) {
		    isPrimeNumber = false;
		    break; // exit the inner for loop
		}
	    }

	    // print the number if prime
	    if (isPrimeNumber) {
		System.out.print(i + " ");
	    }
	}

    }
}
// End coding
