package core;

import java.util.Scanner;

public class RecursiveLongestString {
    public static String longest(String strings) {
	int i = strings.indexOf(" ");
	if (i < 0)
	    return strings;
	if (strings.substring(0, i).length() >= longest(strings.substring(i + 1)).length()) // base case
	    return longest(strings.substring(0, i));
	else
	    return longest(strings.substring(i + 1));
    }

    public static void main(String[] args) {
	System.out.println("Enter multiple strings: ");
	Scanner input = new Scanner(System.in);
	String strings = input.nextLine();
	input.close();
	System.out.println("The longest string is: " + longest(strings) + " chars");
    }
}
