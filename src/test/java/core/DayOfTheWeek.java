package core;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
	System.out.print("Enter a date [mm/dd/yyyy]: ");
	Scanner input = new Scanner(System.in);
	String date = input.nextLine();
	input.close();

	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.YEAR, Integer.parseInt(date.split("/")[2]));
	cal.set(Calendar.MONTH, Integer.parseInt(date.split("/")[0]) - 1);
	cal.set(Calendar.DATE, Integer.parseInt(date.split("/")[1]));

	String weekday = new java.text.SimpleDateFormat("EEEE").format(cal.getTime());
	System.out.println("The day of the week is : " + weekday);
    }

}
