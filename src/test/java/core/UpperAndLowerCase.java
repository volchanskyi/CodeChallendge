package core;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String string = input.nextLine();
	input.close();
	String swCase = "";
	// Start coding
	for (int i = 0; i < string.length(); i++) {
	    char letter = string.charAt(i);
	    if ((65 <= letter) && (letter <= 90)) {
		letter = (char) (letter + 32);
	    } else if ((97 <= letter) && (letter <= 122)) {
		letter = (char) (letter - 32);

	    }
	    swCase += letter;
	}
	// End coding

	System.out.print("String \"" + string + "\" with switched case: " + swCase);
    }
}
