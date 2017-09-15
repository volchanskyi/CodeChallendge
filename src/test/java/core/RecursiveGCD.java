package core;

import java.util.Scanner;

public class RecursiveGCD {
    public static int gcd(int first, int second) {
	if (second == 0)
	    return first; // base case
	else
	    return gcd(second, first % second);
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a = input.nextInt();
	System.out.println("Enter second number: ");
	int b = input.nextInt();
	input.close();
	System.out.println("GCD is: " + gcd(a, b));
    }

}
