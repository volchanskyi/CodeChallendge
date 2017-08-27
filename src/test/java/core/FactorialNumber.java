package core;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();
	System.out.print("Factorial: ");

	// Start coding
	int factorial = 1;

	int i = 1;
	while (i <= number) {
	    factorial *= i;
	    i++;
	}

	System.out.println("Factorial of number " + number + " is " + factorial);

	// End coding
    }
}
