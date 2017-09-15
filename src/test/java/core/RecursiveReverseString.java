package core;

import java.util.Scanner;

public class RecursiveReverseString {
    public static String reverse(String string) {
	if (string.length() < 2)
	    return string; // base case
	String reversed = reverse(string.substring(1)) + string.charAt(0);
	return reversed;
    }

    public static void main(String[] args) {
	System.out.println("Enter a string: ");
	Scanner input = new Scanner(System.in);
	String string = input.nextLine();
	input.close();
	System.out.println("String: " + string + " in reverse: " + reverse(string));

    }

}
