package day27_Arrays_part4;

import java.util.Arrays;

public class task95_ClassScores {
	
	public static void main(String[] args) {
				
		int[][] scores = {
				{68, 75, 54, 80},
				{100, 64, 20, 50},
				{10, 35, 40, 90}
		};
		
		//1. Calculate the avg score of student-1
		
		int sum = 0;
		for(int each: scores[0]) {
			sum+=each;
		}
		System.out.println("Average score of student #1: " + sum/scores[0].length);	
		
		// 2. Calculate the total math scores
		int totalMath = 0;
//		System.out.println(scores[0][0]);
//		System.out.println(scores[1][0]);
//		System.out.println(scores[2][0]);
		
		for(int i=0; i<scores.length; i++) {
			totalMath+=scores[i][0];
		}
		System.out.println("Total math score: " + totalMath);
		
	}

}
