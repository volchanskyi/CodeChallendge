package core;

import java.util.Scanner;

public class Test {


    	public static void main(String[] args) {
    		Scanner console = new Scanner(System.in);
    		
    		System.out.println("Collatz Conjecture:");
    		System.out.print("Enter a number: ");
    		int num = console.nextInt();
    		System.out.println("It takes " + solve(num) + " steps to reach 1 using the Collatz Conjecture,"); 
    		System.out.println("beginning with the number " + num + ".");
    		
    	}
    	
    	// collatz algorithm 
    	// pre-condition: n > 1
    	public static int solve(int n) {
    		if (n == 1) {
    			return 0; 
    		} else if (n % 2 == 0) {
    			return 1 + solve(n / 2);
    		} else {
    			return 1 + solve(n * 3 + 1);
    		}	 	
    	}

    }

