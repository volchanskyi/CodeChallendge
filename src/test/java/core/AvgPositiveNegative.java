package core;

import java.util.Scanner;

public class AvgPositiveNegative {
    public static void main(String a[]) throws Exception {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter an amount of numbers: ");
	int amount = scan.nextInt();
	int[] arr = new int[amount];

	double avg_pos = 0.0, avg_neg = 0.0;

	for (int i = 0; i < amount; i++) {
	    System.out.print("Enter Number [" + i + "]:");
	    arr[i] = scan.nextInt();

	} scan.close();

	// Write your logic here
	int pos_count = 0, neg_count = 0, positive = 0, negative = 0;

	for (int number : arr) {
	    if (number > 0) {
		positive += number;
		pos_count++;
	    } else if (number < 0) {
		negative += number;
		neg_count++;
	    }
	}
	avg_pos = (double) positive / pos_count;
	avg_neg = (double) negative / neg_count;

	// end
	System.out.println("\npositivenumbers:\n" + avg_pos);
	System.out.println("negativenumbers:\n" + avg_neg);
    }
}
