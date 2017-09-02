package core;

import java.util.Scanner;

public class StringStatistics {

    static char[] vowel = { 'a', 'e', 'i', 'o', 'u', 'y' };
    static char[] consonant = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
	    'w', 'x', 'z' };
    static char[] specialChar = { '~', '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '[',
	    ']', '\\', ';', '\'', ',', '.', '/', '{', '}', '|', ':', '"', '<', '>', '?' };

    static boolean contains(char ch, char[] array) {
	for (char c : array) {
	    if (c == ch) {
		return true;
	    }
	}
	return false;
    }

    public static int vowels(String string) {
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
	    if (contains(string.toLowerCase().charAt(i), vowel)) {
		++count;
	    }
	}
	return count;
    }

    public static int consonants(String string) {
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
	    if (contains(string.toLowerCase().charAt(i), consonant)) {
		++count;
	    }
	}
	return count;
    }

    public static int specialchars(String string) {
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
	    if (contains(string.toLowerCase().charAt(i), specialChar)) {
		++count;
	    }
	}
	return count;
    }

    public static int digits(String string) {
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
	    char ch = string.toLowerCase().charAt(i);
	    if (ch >= '0' && ch <= '9') {
		++count;
	    }
	}
	return count;
    }

    public static int spaces(String string) {
	int count = 0;
	for (int i = 0; i < string.length(); i++) {
	    char ch = string.toLowerCase().charAt(i);
	    if (ch == ' ') {
		++count;
	    }
	}
	return count;
    }

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String string = input.nextLine();
	input.close();
	System.out.println("String \"" + string + "\" contains: " + vowels(string) + " vowels; " + consonants(string)
		+ " consonants; " + specialchars(string) + " special characters; " + digits(string) + " digits; "
		+ spaces(string) + " spaces");

    }
}
