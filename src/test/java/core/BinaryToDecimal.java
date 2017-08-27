package core;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a binary number: ");
	String binary = input.nextLine();
	input.close();
	if (!binary.matches("^[01]+$")) {
	    System.err.println("Not a binary");
	    System.exit(0);
	}
	if (binary.length() > 19) {
	    System.err.println("Supports no more than 19 digits");
	    System.exit(0);
	}

	Long bin = Long.valueOf(binary);
	int decimal = 0;
	int power = 0;
	while (bin > 0) {
	    decimal += bin % 10 * Math.pow(2, power);
	    bin = bin / 10;
	    power++;
	}
	System.out.println("Decimal: " + decimal);

    }

}
