package day10_controlFlowStatements_4;

public class task40_evenOnlyNumber {
	
	public static void main(String[] args) {
		
		// Write a program that displays all even numbers between 1-100 in SAME LINE!

		
		for (int i=0; i<=100; i+=2) {
			System.out.print(i + " "); //PARTIALLY CORRECT: prints even numbers starting from i=0
		}
		
		System.out.println();
		
		for (int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " "); //CORRECT: prints even number starting from i=2
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
