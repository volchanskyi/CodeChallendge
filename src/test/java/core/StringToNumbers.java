package core;

import java.util.Scanner;

public class StringToNumbers {

    public static void main(String[] args) {
	System.out.print("Type a number: ");
	Scanner input = new Scanner(System.in);
	String word = input.nextLine();
	input.close();
	System.out.print("Entered number is: ");
	
	// Start coding
	int number = 0;
	String [] array = word.split(" ");
	
	for (String item : array) {
	    if (item.equals("zero")) {
		number = 0;
	    }
	    else if (item.equals("one")) {
		number = 1;
	    }
	    else if (item.equals("two")) {
		number = 2;
	    }
	    else if (item.equals("three")) {
		number = 3;
	    }
	    else if (item.equals("four")) {
		number = 4;
	    }
	    else if (item.equals("five")) {
		number = 5;
	    }
	    else if (item.equals("six")) {
		number = 6;
	    }
	    else if (item.equals("seven")) {
		number = 7;
	    }
	    else if (item.equals("eight")) {
		number = 8;
	    }
	    else if (item.equals("nine")) {
		number = 9;
	    }
	    else if (item.equals("ten")) {
		number = 10;
	    }
	    else if (item.equals("eleven")) {
		number = 11;
	    }
	    else if (item.equals("twelve")) {
		number = 12;
	    }
	    else if (item.equals("thirteen")) {
		number = 13;
	    }
	    else if (item.equals("fourteen")) {
		number = 14;
	    }
	    else if (item.equals("fifteen")) {
		number = 15;
	    }
	    else if (item.equals("sixteen")) {
		number = 16;
	    }
	    else if (item.equals("seventeen")) {
		number = 17;
	    }
	    else if (item.equals("eighteen")) {
		number = 18;
	    }
	    else if (item.equals("nineteen")) {
		number = 19;
	    }
	    else if (item.equals("twenty")) {
		number = 20;
	    }
	    System.out.print(number);
	}
	// End coding
    }

}
