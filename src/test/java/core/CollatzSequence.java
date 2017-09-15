package core;

import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	input.close();
	String result = String.valueOf(number);
	while (number < 1) {
	    if (number % 2 == 0) {
		number = number / 2;
	    } else {
		number = number * 3 - 1;
	    }
	    result += " " + String.valueOf(number);
	}
	System.out.println("Collatz sequance is: " + result);

    }

}
