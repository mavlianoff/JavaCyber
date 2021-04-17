package day7_controlFlowStatements_1;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int score=75;
		
		if(score>=70) {
			
			System.out.println("Good job! Never stop to push your limits!");
		
		} else {
		
			System.out.println("Could be done done better! Try again!");
		}
		
		
		System.out.println("*****************************************");
		
		int score1=75;
		
		if(score1>=70) {
			
			System.out.println("Good job! Never stop to push your limits!");
		
		}
		if (score1<70){
		
			System.out.println("Could be done done better! Try again!");
		}
		
		System.out.println("*****************************************");

	}

}
