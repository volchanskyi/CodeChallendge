package core;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an angle: ");
	int angle = input.nextInt(); input.close();
	int quadrant;
	
	quadrant = (angle /90) % 4 + 1;
	System.out.println("Quadrant is: " + quadrant);

    }

}
