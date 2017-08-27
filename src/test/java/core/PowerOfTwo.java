package core;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int number) {
	return (number != 0) && ((number & (number - 1)) == 0);
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	input.close();

	System.out.println(number + " is " + (isPowerOfTwo(number) ? "a power of two" : "not a power of two"));

    }

}
