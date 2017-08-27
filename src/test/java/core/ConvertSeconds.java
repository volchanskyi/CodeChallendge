package core;

import java.util.Scanner;

public class ConvertSeconds {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter seconds: ");
	int seconds = input.nextInt(); input.close();
	
	int hours = seconds / 3600;
	int minutes = (seconds % 3600) / 60;
	int secs = seconds % 60;
	System.out.println(String.format("%02d:%02d:%02d", hours, minutes, secs));
	
    }

}
