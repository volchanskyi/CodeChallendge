package core;

import java.util.Scanner;

public class RecursiveSumOfOddNumbers {
    public static long sumodd(long number) {
	if (number == 0)
	    return 0; // Base case
	else if (number % 2 != 0)
	    return number + sumodd(number - 1);
	else
	    return sumodd(number - 1);
    }

    public static void main(String args[]) {
	System.out.println("Enter a number: ");
	Scanner input = new Scanner(System.in);
	long number = input.nextLong();
	input.close();
	if (number > 9999) {
	    System.out.println("Increase Stack Memory: -Xss 100M");
	    System.exit(0);
	}
	System.out.println("Sum of odd numbers between 1-" + number + ": " + sumodd(number));
    }
}
