package core;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a positive decimal number: ");
	int decimal = Math.abs(input.nextInt()); input.close();
	String hexadecimal = "";
	String hexadecimals = "0123456789abcdef";
	
	
	while (decimal > 0) {
	    hexadecimal = hexadecimals.charAt((decimal % 16)) + hexadecimal;
	    decimal = decimal /16;
	} 
	System.out.println("Hex: " + hexadecimal);
	
    }

}
