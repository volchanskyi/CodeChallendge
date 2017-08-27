package core;

import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt(); input.close();
	int reverse = 0;
	while (number != 0) {
	    reverse = reverse * 10;
	    reverse = reverse + number % 10;
	    number = number / 10;
	}
	System.out.println("Reverse: " + reverse);

    }

}
