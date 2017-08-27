package core;

import java.util.Scanner;

public class SortThreenumbers {

    public static void main(String[] args) {

	int a, b, c;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers:");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	sc.close();
	System.out.print("Sorted numbers:");
	
	abcSort(a, b, c);

	// print stats
	
    }

    private static void abcSort(int a, int b, int c) {
	if ((a < b) && (b < c)) {
	    System.out.print(a + " " + b + " " + c);
	}
	if ((a < b) && (b > c)) {
	    System.out.print(a + " " + c + " " + b);
	}
	if ((a > b) && (b > c)) {
	    System.out.print(c + " " + b + " " + a);
	}
	if ((a > b) && (b < c)) {
	    System.out.print(b + " " + c + " " + a);
	}
    }

}
