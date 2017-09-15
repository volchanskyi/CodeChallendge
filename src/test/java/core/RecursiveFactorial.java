package core;

import java.util.Scanner;

public class RecursiveFactorial {
    public static long factorial(int number) {
	if (number < 1)
	    return 1; // base case
	else
	    return number * factorial(number - 1);
    }

    public static void main(String[] args) {
	System.out.println("Enter a number: ");
	Scanner input = new Scanner(System.in); 
	int number = input.nextInt(); input.close(); // 25 => 7_034_535_277_573_963_776
	System.out.println("Factorial of the number " + number + " is " + factorial(number));
    }
}
