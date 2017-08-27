package core;

import java.util.Scanner;

public class SumOddNumbers {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:  ");
	int number = input.nextInt();
	input.close();
	System.out.print("Odd numbers are: ");
	int storage = 0;
	// Start coding

	for (int i = 0; i <= number; i++) {
	    if (i % 2 != 0) {
		System.out.print(i + ", ");
		storage += i;

	    }

	}
	System.out.println("\n Sum of all odd numbers :" + storage);
	// End coding
    }
}