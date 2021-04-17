package day11_controlFlowStatements_5;

public class task47_astericsPattern {

	public static void main(String[] args) {
		/*
		
		Write a Java program to create pattern
		******
		******
		******
		******
		******
		******
		******
		
		 */
		
		int rows=7;
		int columns=6;
		
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=columns; j++) {
				System.out.print("*");			
			
			}
			
			System.out.println();
		}

	}

}
