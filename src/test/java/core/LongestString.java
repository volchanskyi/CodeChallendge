package core;

import java.util.Scanner;

public class LongestString {
    public static String longest(String strings) {

	// Start coding
	int maxLength = 0;
	String[] array = strings.split("\\s");
	String longest = null;
	for (String string : array) {
	    if (string.length() > maxLength) {
		maxLength = string.length();
		longest = string;
	    }
	}
	// End coding
	return longest;
    }

    public static void main(String[] args) {
	System.out.print("Entering multiple strings: ");
	Scanner input = new Scanner(System.in);
	String strings = input.nextLine();
	input.close();
	System.out.println("The lonest string is: " + longest(strings));
    }
}
