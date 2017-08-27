package core;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

	System.out.print("Enter the length of the Fibonacci series: ");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	sc.close();
	System.out.println("Fibonacci series are: ");

	// Start coding
	long fibonacci = 0;
	long fibonacci2 = 1;
	long next;
	for (int i = 1; i <= number; i++) {
	    System.out.println(i + ": " + fibonacci);
	    next = fibonacci + fibonacci2;
	    fibonacci = fibonacci2;
	    fibonacci2 = next;
	}
	// End coding
    }
}