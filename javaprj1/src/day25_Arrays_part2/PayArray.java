package day25_Arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		// This program stores in an array the hours worked for by 5 employees who all make the same hourly wage
		// Display their gross pay
		
		final int emplCount = 5;
		double payRate;
		double grossWage;
		
		
		int[] hoursWorked = new int[emplCount];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your worked hours: ");
		for(int i=0; i<5; i++) {
			hoursWorked[i] = scan.nextInt();
		}
		
		System.out.println("Enter your pay rate: ");
		payRate = scan.nextDouble();
		
		for(int i=0; i < emplCount; i++) {
			grossWage = hoursWorked[i] * payRate;
			System.out.println("Employee #" + (i+1) + ": $" + grossWage);
		}
	
	}
}
