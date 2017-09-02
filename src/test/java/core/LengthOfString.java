package core;

import java.util.Scanner;

public class LengthOfString {
    public static int length(String string) {
	String regex = "(?s)";
	int length = 0;
	while (!string.matches(regex)) {
	    regex += ".";
	    ++length;
	}
	return length;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a strint: ");
	String string = input.nextLine();
	input.close();
	System.out.println("Length of string \"" + string + "\" is " + length(string));
    }

}
