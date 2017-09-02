package core;

import java.util.Scanner;

public class PangramOrNot {
    private static boolean isPangram(String sentence) {
	sentence = sentence.toLowerCase();
	if (sentence.length() < 26) {
	    return false;
	}
	for (char c = 'a'; c <= 'z'; c++) {
	    if (sentence.indexOf(c) < 0) {
		return false;
	    }
	}

	return true;
    }
    // End coding

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a sentence: ");
	String sentence = input.nextLine();
	input.close();
	System.out.println("Sentence \"" + sentence + "\" is " + (isPangram(sentence) ? "pangram" : "not pangram"));
    }
}
