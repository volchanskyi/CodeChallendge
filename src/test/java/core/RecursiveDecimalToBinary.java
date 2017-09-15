package core;

import java.util.Scanner;

public class RecursiveDecimalToBinary {
    static String binary(long decimal){
	if ( decimal > 0) // base case
	    return (binary(decimal /2) + "" + decimal % 2); return "";
    }
    public static void main(String[] args) {
	System.out.println("Enter a positive decimal number: ");
	 Scanner input = new Scanner(System.in);
	 long decimal = Math.abs(input.nextLong()); input.close();
	 System.out.println("Binary of number \"" + decimal + "\"" +  " is " + binary(decimal));
	 
    }

}
