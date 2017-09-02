package core;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = input.nextLine();
	input.close();
	char[] c = str.toCharArray();
	String reverse = "";

	// Start coding
	for (int i = c.length - 1; i >= 0; i--) {
	    reverse += c[i];
	}
	// End coding

	System.out.println("String \"" + str + "\" in reverse: " + reverse);
    }
}
