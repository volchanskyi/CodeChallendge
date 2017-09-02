package core;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

	System.out.print("Enter a string: ");
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	input.close();
	char[] chars = str.toCharArray();
	input.close();
	String reverse = "";
	System.out.print("Perfect numbers are: ");

	// Start coding
	for (int i = chars.length - 1; i >= 0; i--) {
	    reverse += chars[i];
	}
	// End coding

	System.out.println("String \"" + str + "\" is " + (str.equals(reverse) ? "palindrome" : "not palindrome"));
    }
}
