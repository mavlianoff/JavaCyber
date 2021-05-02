package day25_Arrays_II;
import java.util.Scanner;
public class task_RainFall {
	
	public static void main(String[] args) {
		/*
		Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles. 
		The program should have methods that return the following:
			-total rainfall for the year
			-the average monthly rainfall
			-the month with the most rain
			-the month with the least rain
		Input Validation: Do not accept negative numbers for the monthly rainfall figures.
		 */
		
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double[] rainFall = new double[12];
		
		System.out.println("Please enter series of rainfall data for the month ahead: ");
		System.out.println("Month \t Rainfall(in inches)");	
		
		for(int i=0; i<months.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print(months[i] + ": ");
			rainFall[i] = scan.nextDouble();
		}
		
		rainfallCalculation(rainFall);
		
	}
	
	public static void rainfallCalculation(double[] rainfallArray) {
		double sum = 0;
		double average = 0;
		int max = 0;
		int min = 0;
		
		System.out.println("The sum of all the rain is: " + sum);
		System.out.println("The average rainfall is: " + average);
		System.out.println("The max rain is: " + max);
		System.out.println("The min rain is: " + min);
	}

}
