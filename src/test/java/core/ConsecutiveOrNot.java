package core;

import java.util.Scanner;

public class ConsecutiveOrNot {
    public static boolean isConsecutive(int... numbers) {
	for (int i = 0; i < numbers.length - 1; i++) {
	    if (numbers[i] < numbers[i + 1]) {
		if (numbers[i] + 1 != numbers[i + 1]) {
		    return false;
		}
	    } else if (numbers[i] > numbers[i + 1]) {
		if (numbers[i] - 1 != numbers[i + 1]) {
		    return false;
		}
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	input.close();
	System.out.print(number + " is ");
	int[] numbers = new int[String.valueOf(number).length()];
	int i = String.valueOf(number).length() - 1;
	while (number > 0) {
	    numbers[i] = number % 10;
	    number /= 10;
	    i--;
	}
	;
	System.out.print(isConsecutive(numbers) ? "consecutive" : "not consecutive");

    }
}
