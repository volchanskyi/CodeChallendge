package core;

import java.util.Scanner;

public class ArmstrongNumbers {
    private static boolean isArmstrong(int number) {
	int temp = number;
	int length = 0;
	while (temp != 0) {
	    length++;
	    temp = temp / 10;
	}
	int result = 0;
	int original = number;
	while (number > 0) {
	    result = result + power(number % 10, length);
	    number = number / 10;
	}
	if (original == result) {
	    return true;
	} else {
	    return false;
	}
    }

    public static void main(String args[]) {
	System.out.println("Enter a number: ");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	input.close();

	int max = number;
	for (int i = 0; i <= max; i++) {
	    if (isArmstrong(i)) {
		System.out.println(i + ", ");
	    }
	}
    }

    static int power(int number, int p) {
	int pow = 1;
	for (int i = 1; i <= p; i++) {
	    pow = pow * number;
	}
	return pow;
    }
}
