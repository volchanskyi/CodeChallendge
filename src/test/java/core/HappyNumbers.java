package core;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumbers {

    public static boolean isHappy(int number) {
	Set<Integer> unique = new HashSet<Integer>();
	while (unique.add(number)) {
	    int value = 0;
	    while (number > 0) {
		value += Math.pow(number % 10, 2);
		number /= 10;
	    }
	    number = value;
	}
	return number == 1;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt(); input.close();
	System.out.print(number + " is ");
	System.out.println(isHappy(number) ? "A happy number" : "Unhappy number");

    }

}
