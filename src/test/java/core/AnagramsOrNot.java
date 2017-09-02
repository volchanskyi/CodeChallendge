package core;

import java.util.Scanner;

public class AnagramsOrNot {
    public static boolean anagrams(String first, String second) {
	if (first.replaceAll("\\s", "").length() != second.replaceAll("\\s", "").length()) {
	    return false;
	}
	int val = 0;
	for (int i = 0; i < first.replaceAll("\\s", "").length(); i++) {
	    val += Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
	    val -= Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2);
	}
	return val == 0;
    }

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first phrase: ");
	String first = input.nextLine();
	System.out.print("Enter second phrase: ");
	String second = input.nextLine();
	input.close();
	System.out.print("Phrases \"" + first + " & " + second + "\" are "
		+ (anagrams(first, second) ? "anagrams" : "not anagrams"));
    }
}
