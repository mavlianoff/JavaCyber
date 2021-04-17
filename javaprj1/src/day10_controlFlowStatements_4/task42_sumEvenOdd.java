package day10_controlFlowStatements_4;

public class task42_sumEvenOdd {

	public static void main(String[] args) {
		// Write a program that displays sum of even and odd numbers between 1 and 100 excluding 100

		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<100; i++) {
			
			if(i%2==0) {
			 
				sumEven=sumEven+i;
			
			}else if(i%2!=0) {
			
				sumOdd=sumOdd+i;

			}
		}
		
		System.out.println("sum of even numbers: " + sumEven);
		System.out.println("sum of odd number: " + sumOdd);
		
	}

}
