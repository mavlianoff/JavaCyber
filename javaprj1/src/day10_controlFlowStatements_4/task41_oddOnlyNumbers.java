package day10_controlFlowStatements_4;

public class task41_oddOnlyNumbers {

	public static void main(String[] args) {
		
		// Write a program that displays all odd numbers between 5-140 in same line
		
		for (int i=5; i<=140; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}

	}

}
