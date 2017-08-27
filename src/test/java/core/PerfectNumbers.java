package core;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();
	System.out.println("Perfect numbers are: ");

	// Start coding

	final int LIMIT = number;
	for (int i = 2; i < LIMIT; i++) {
	    if (isNumPerfect(i)) {
		System.out.println(i + " is a perfect number");
	    }
	}
    }

    public static boolean isNumPerfect(int n) {
	int sum = 1;
	for (int i = 2; i <= n / 2; i++) {
	    if (n % i == 0) {
		sum += i;
	    }
	}
	return sum == n;
    }

    // End coding
}
