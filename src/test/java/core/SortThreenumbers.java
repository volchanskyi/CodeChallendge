package core;

import java.util.Scanner;

public class SortThreenumbers {
    public static void main(String[] args) {
	// Prompt user to enter three integers
	double num1, num2, num3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers:");
	num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	num3 = sc.nextDouble();
	sc.close();

	sortNumbers(num1, num2, num3);

    }

    private static void sortNumbers(double num1, double num2, double num3) {
	if ((num1 > num2 && num1 > num3)) {
	    if (num2 > num3) {
		System.out.print(num3 + " " + num2 + " " + num1);
	    } else
		System.out.print(num2 + " " + num3 + " " + num1);
	} else if ((num2 > num1 && num2 > num3)) {
	    if (num1 > num3) {
		System.out.print(num3 + " " + num1 + " " + num1);
	    } else {
		System.out.print(num1 + " " + num3 + " " + num2);
	    }
	} else if ((num3 > num1 && num3 > num2)) {
	    if (num1 > num2) {
		System.out.print(num2 + " " + num1 + " " + num3);
	    } else
		System.out.print(num1 + " " + num2 + " " + num3);
	} else {
	    System.out.println("ERROR!");
	}
    }

}
