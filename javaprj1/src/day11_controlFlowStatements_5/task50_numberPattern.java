package day11_controlFlowStatements_5;

public class task50_numberPattern {

	public static void main(String[] args) {
		/*
		Write a Java program to create pattern
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		 */
		
		int rows=5;
//		int columns=5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
