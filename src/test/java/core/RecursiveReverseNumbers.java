package core;

import java.util.Scanner;

public class RecursiveReverseNumbers {
    private static void reverse(long[] numbers) {
	if (numbers.length == 0)
	    return; // Base case
	long[] numbers2 = new long[numbers.length - 1];
	for (int i = 0; i < numbers.length - 1; i++)
	    numbers2[i] = numbers[i + 1];
	reverse(numbers2);
	System.out.print(numbers[0]);
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	long num = input.nextLong();
	input.close();

	System.out.print("Number: " + num + " in reverse: ");
	long[] numbers = new long[String.valueOf(num).length()];
	int i = String.valueOf(num).length() - 1;
	while (num > 0) {
	    numbers[i] = num % 10;
	    num /= 10;
	    i--;
	}
	reverse(numbers);
    }

}
