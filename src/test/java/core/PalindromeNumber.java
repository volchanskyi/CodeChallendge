package core;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int p = input.nextInt();
	input.close();

	// Start coding
	// array of numbers to be checked
	int numbers[] = new int[] { p };

	// iterate through the numbers
	for (int i = 0; i < numbers.length; i++) {

	    int number = numbers[i];
	    int reversedNumber = 0;
	    int temp = 0;

	    /*
	     * If the number is equal to it's reversed number, then the given
	     * number is a palindrome number.
	     *
	     * For example, 121 is a palindrome number while 12 is not.
	     */

	    // reverse the number
	    while (number > 0) {
		temp = number % 10;
		number = number / 10;
		reversedNumber = reversedNumber * 10 + temp;
	    }

	    if (numbers[i] == reversedNumber)
		System.out.println(numbers[i] + " is a palindrome number");
	    else
		System.out.println(numbers[i] + " is not a palindrome number");
	}

    }
}