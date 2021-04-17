package day11_controlFlowStatements_5;

public class task51_clockSimulation {

	public static void main(String[] args) {
		/*
		
		Write a Java program to simulate a clock by using nested loop
		
		 */

		int hour=12;
		int min=60;
		int sec=60;
		
		for(int i=1; i<=hour; i++) {
			for(int j=0; j<min; j++) {
				for(int k=0; k<sec; k++) {
					System.out.println(i+":"+j+":"+ k);
				}
				System.out.println();
			}
		}
	}

}
