package core;

import java.util.Scanner;

public class RecursiveFibonacci {
    private static long fibonacci(int num) {
	if (num == 0)
	    return 0; // base case
	if (num == 1 || num == 2)
	    return 1;
	return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	input.close();
	System.out.print("Fibonacci sequence is: ");
	for (int i = 0; i < number; i++)
	    System.out.print(fibonacci(i) + ", ");
    }
}
