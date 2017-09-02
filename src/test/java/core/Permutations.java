package core;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String string = sc.nextLine();
	sc.close();
	System.out.print("Permutations of string \"" + string + "\" are: ");
	char[] chars = string.toCharArray();
	int number = chars.length;
	int[] array = new int[number];
	int item = 0;
	// Start coding
	for (int i = 0; i < Math.pow(number, number); i++) {
	    item = 0;
	    while (item < number) {
		System.out.print(chars[array[item]] + "");
		item++;
	    }
	    System.out.print(", ");
	    item = 0;
	    while (item < number) {
		if (array[item] < number - 1) {
		    array[item]++;
		    break;
		} else {
		    array[item] = 0;
		}
		item++;
	    }
	}
    }
    // End coding
}
