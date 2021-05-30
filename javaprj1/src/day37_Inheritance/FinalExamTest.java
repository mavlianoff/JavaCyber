package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of questions in the exam: ");
		int questions = scan.nextInt();
		
		System.out.print("Number of questions missed: ");
		int missed = scan.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		
		System.out.println("The grade for exam is " + exam.getGrade());
		
	}

}
