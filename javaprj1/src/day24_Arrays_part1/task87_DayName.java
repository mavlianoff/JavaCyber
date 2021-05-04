package day24_Arrays_I;

import java.util.Scanner;

public class task87_DayName {
	
	public static void main(String[] args) {
		
		/*
		Create an array that holds the days.
		User should be able to enter the day index and output should be:
			“Today is Monday”
		 */
		
		Scanner scan = new Scanner(System.in);

		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		System.out.print("Please enter day index: ");
		int index = scan.nextInt();
		scan.close();
		
		System.out.println("Today is " + days[index]);
		
	}

}
