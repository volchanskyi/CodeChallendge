package core;

import java.util.Scanner;

public class RecursiveLargestNumber {
    public static int largest(int[] a, int index) {
	if (index > 0) // base case
	    return Math.max(a[index], largest(a, index - 1));
	else
	    return a[0];
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter numbers: ");
	String string = input.nextLine();
	input.close();
	String[] strings = string.split(" ");
	int[] numbers = new int[strings.length];
	for (int i = 0; i < strings.length; i++)
	    numbers[i] = Integer.parseInt(strings[i]);
	System.out.println("Largest number is: " + largest(numbers, numbers.length - 1));
    }

}

