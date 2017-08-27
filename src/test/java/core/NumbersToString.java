package core;

import java.util.Scanner;

public class NumbersToString {

    public static String units[] = { "zero", "one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten",
	    "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
    public static String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    
    public static String convert(long number) {
	if (number < 20) {
	    return units[(int) number];
	}
	if (number < 100) {
	    return tens[(int) (number / 10)] + ((number % 10 > 0) ? " " + convert(number % 10) : "");
	}
	if (number < 1000) {
	    return units[(int) (number / 100)] + "hundred" + ((number % 100 > 0) ? " and " + convert(number % 100) : "");
	}
	if (number < 1000000) {
	    return convert(number / 1000) + "thousand" + ((number % 1000 > 0) ? " " + convert(number % 1000) : "");
	}
	if (number < 1000000000) {
	    return convert(number / 1000000) + "million" + ((number % 1000000 > 0) ? " " + convert(number % 1000000) : "");
	}
	if (number < 1000000000000000L) {
	    return convert(number / 1000000000000L) + "billion" + ((number % 1000000000000L > 0) ? " " + convert(number % 1000000000000L) : "");
	}
	if (number < 1000000000000000L) {
	    return convert(number / 1000000000000L) + "trillion" + ((number % 1000000000000L > 0) ? " " + convert(number % 1000000000000L) : "");
	}
	else {
	    return convert(number / 1000000000000L) + "quadrillion" + ((number % 1000000000000L > 0) ? " " + convert(number % 1000000000000L) : "");
	}
	
    }
    
    public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	input.close();
	
	System.out.println(convert(number));
}
}
