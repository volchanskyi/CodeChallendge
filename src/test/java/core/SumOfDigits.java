package core;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

	System.out.print("Enter a digits:  ");
	Scanner input = new Scanner(System.in);
	long number = input.nextInt();
	input.close();
	long sum = 0;
	for (int i = 0; i < String.valueOf(number).length(); i++) {
	    sum += Integer.parseInt(String.valueOf(number).substring(i, i + 1));
	}
	System.out.print("Sum of the digits: " + sum);

	
    }
}