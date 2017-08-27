package core;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

	System.out.print("Enter a number:  ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();
	System.out.print("Sum of odd numbers: ");

	// Start coding
	long sum =0;
	for(int i = 0; i <= number; i++) {
	    if (i % 2 !=0) {
		sum += i;
	    }
	}
	System.out.print(sum);
	// End coding
    }
}