package core;

import java.util.Scanner;

public class AbundantNumbers {
    public static boolean isAbundantNumber(int number) {
	int temp = 0;
	for (int i = 1; i <= number / 2; i++) {
	    if (number % i == 0) {
		temp += i;
	    }
	}
	if (temp > number) {
	    return true;
	} else {
	    return false;
	}
    }

    public static void main(String[] args) {
	int num;
	System.out.print("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	sc.close();

	for (int i = 1; i <= num; i++) {
	    if (isAbundantNumber(i)) {
		System.out.print(i+ " ");
	    }
	}

    }

}
