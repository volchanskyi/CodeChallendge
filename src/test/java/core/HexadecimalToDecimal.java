package core;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a hexadecimal number: ");
	String hexadecimal = input.nextLine();
	input.close();

	if (!hexadecimal.matches("^[0-9a-fA-F]+$")) {
	    System.err.println("Not a hexadecimal");
	    System.exit(0);
	}
	if (hexadecimal.length() > 19) {
	    System.err.println("Supports not more than 19 digits");
	    System.exit(0);
	}
	
	int decimal = 0;
	String digits = "0123456789ABCDEF";
	for (int i = 0; i < hexadecimal.length(); i++) {
	    char c = hexadecimal.toUpperCase().charAt(i);
	    int digit = digits.indexOf(c);
	    decimal = 16 * decimal + digit;
	}
	System.out.println("Decimal: " + decimal);

    }

}
