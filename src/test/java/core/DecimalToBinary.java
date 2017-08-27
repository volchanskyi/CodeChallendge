package core;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter a decimal number: ");
	int decimal = sc.nextInt();
	sc.close();
	String binary = "";
	while (decimal > 0) {
	    binary = String.valueOf(decimal % 2) + binary;
	    decimal = decimal / 2;
	}
	System.out.println("Binary equivalent number is: " + binary);
    }
}
