package day18_readingUserInput;

import java.util.Scanner;

public class lab2_Q4_genderPercentage {

	public static void main(String[] args) {
		
		/*
		Write a program that asks user for the number of males and the number of females registered in a class. 
		The program should display the percentage of males and females in the class.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number of male students registered: ");
		int maleStudents = scan.nextInt();
		System.out.print("Please enter number of female students registered: ");
		int femaleStudents = scan.nextInt();	
		
		int totalStudents = maleStudents + femaleStudents;
		
		double maleStudentsPercentage = maleStudents * 100 / totalStudents;
		double femaleStudentsPercentage = femaleStudents * 100 / totalStudents;
	
		System.out.println("Percentage of male students: " + maleStudentsPercentage + "%");
		System.out.println("Percentage of female students: " + femaleStudentsPercentage + "%");

	}

}
