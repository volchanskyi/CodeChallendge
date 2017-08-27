package core;

import java.util.Scanner;

public class AvgPositiveNegative {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an amount of numbers:  ");
	int amount = sc.nextInt();
	
	int[] array = new int[amount];

	for (int i = 0; i < array.length; i++) {
	    System.out.println("Enter a number: ");
	    array[i] = sc.nextInt();

	}
	sc.close();
	Double pos = new Double(0);
	Double neg = new Double(0);
	double posCount = 0;
	double negCount = 0;
	for (int j = 0; j < array.length; j++) {
	    if (array[j] > 0) {
		posCount++;
		pos += array[j];
	    } else {
		negCount++;
		neg += array[j];
	    }
	}
	if (pos.isNaN() || pos == 0.0) {
	    System.out.println("No positive numbers were put, go ahead and check on negative");
	} else {
	    System.out.println("Average of positive numbers: " + (pos / posCount));
	}

	if (neg.isNaN() || neg == 0.0) {
	    System.out.println("No negative numbers were put. You have only positive ones");
	} else {
	    System.out.println("Average of negative numbers: " + (neg / negCount));
	}

    }

}