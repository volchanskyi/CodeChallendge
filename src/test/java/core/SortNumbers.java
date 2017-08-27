package core;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number:  ");
	int a = input.nextInt();
	System.out.print("Enter second number:  ");
	int b = input.nextInt();
	System.out.print("Enter third number:  ");
	int c = input.nextInt();
	input.close();
	System.out.print("Sorted numbers: ");
	input.close();
	int[] ints = { a, b, c };
	// Start coding
	Arrays.sort(ints);
	int i;
	for (i = 0; i < ints.length; i++) {
	    System.out.println(ints[i]);
	}
	// End coding
    }
}