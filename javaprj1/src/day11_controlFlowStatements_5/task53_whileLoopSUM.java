package day11_controlFlowStatements_5;

public class task53_whileLoopSUM {

	public static void main(String[] args) {
		/*
		Write a program using while loop, that calculates the sum of the even numbers between 0 and 100
		 */

		int sumEven=0;
		int i=0;
		while(i<100) {
			if(i%2==0) {
				sumEven=sumEven+i;	
			}
			
			i++;
			
		}
		System.out.println(sumEven);
	
	
	}
		
}


