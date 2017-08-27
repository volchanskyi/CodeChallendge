package core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class NumberOfOccurrence {

    public static void main(String arg[]) throws Exception {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number:");
	int number = Integer.parseInt(br.readLine());

	System.out.println("Enter number to search:");
	int n = Integer.parseInt(br.readLine());

	String ns = String.valueOf(number);
	String ss = String.valueOf(n);
	int count = ns.length() - ns.replace(ss, "").length();
	System.out.print("Number of occurence of: " + n + " in number: " + number + " is: " + count);

    }

}
