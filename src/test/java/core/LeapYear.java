package core;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

	System.out.print("Enter a year: ");
	Scanner input = new Scanner(System.in);
	int year = input.nextInt();
	input.close();
	if (String.valueOf(year).length() != 4) {
	    System.out.println("Invalid year");
	    System.exit(0);
	}

	System.out.print(year + " is ");
	if ((year > 1582) && (year % 4 == 0) || (year % 400 == 0)) {
	    System.out.println("a leap year");
	} else {
	    System.out.println("not a leap year");
	}
	
    }
}