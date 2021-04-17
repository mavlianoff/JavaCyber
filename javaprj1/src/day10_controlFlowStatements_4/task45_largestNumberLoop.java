package day10_controlFlowStatements_4;

public class task45_largestNumberLoop {

	public static void main(String[] args) {
		/*
		User should be able to declare 2 values and program should display which number is largest.
		if numbers are equal, it should display numbers are equal
		Above steps need to repeated to number of times that is also declared by user.
		 */

		int i1=5;
		int i2=7;
		
		for(int lpp=1; lpp<=5; lpp++) {
			if (i1>i2) {
				System.out.println("i1 is the largest");
			}else if(i2>i1) {
				System.out.println("i2 is the largest");
			}else {
				System.out.println("numbers are equal");
			}
			
			
			
			
			
			
		}
	}

}
