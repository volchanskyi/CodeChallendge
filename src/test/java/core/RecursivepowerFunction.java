package core;

import java.util.Scanner;

public class RecursivepowerFunction {
    private static double power(double number, int exponent) {
	if (exponent == 0)
	    return 1; // base case
	double result = power(number, exponent / 2);
	result = result * result;
	if (exponent % 2 == 0)
	    return result;
	return number * result;
    }

    public static void main(String[] args) {
	System.out.println("Enter your base number and exponent: ");
	Scanner input = new Scanner(System.in);
	double base = input.nextDouble();
	int exponent = input.nextInt(); input.close();
	System.out.println("Base \"" + base + "\" and exponent \"" + exponent + "\" is " + power(base, exponent)); 
    }
}
