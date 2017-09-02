package core;

import java.util.Scanner;

public class ReverseAStatement {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a statement: ");
	String statement = input.nextLine();
	input.close();
	String[] array = statement.split(" ");
	String reverse = "";
	// Start coding
	for (int i = array.length - 1; i >= 0; i--) {
	    reverse += array[i];
	    reverse += " ";
	}

	// End coding

	System.out.println("Statement \"" + statement + "\" in reverse: " + reverse);
    }
}
