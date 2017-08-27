package core;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	sc.close();
	String octal = "";
	String octals = "01234567";
	while (num > 0) {
	    octal = octals.charAt((num % 8)) + octal;
	    num = num / 8;
	}

	System.out.println("Octal number is: " + octal);
    }
}
