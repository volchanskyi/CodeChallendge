package core;

import java.util.Scanner;

public class BinaryOrNot {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number 10 digits or less: ");
	while (!input.hasNextInt()) {
	    System.out.println("That`s not a number or more than 10 digits");
	    input.next();
	}
	int initialNumber = input.nextInt(); input.close();
	String result = "binary";
	int number = initialNumber;
	while (number!= 0) {
	    int temp = number % 10;
	    if (temp > 1) {
		result = "not a binary"; break;
	    } else {
		number = number / 10;
	    }
	}
	System.out.println(initialNumber + " is " + result);
    }
}
