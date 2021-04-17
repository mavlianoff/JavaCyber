package day8_controlFlowStatements_2;

public class task29_greaterNumber {

	public static void main(String[] args) {
		
		/*
		• Declare and initialize 2 variable numbers
		• Program should tell which number is bigger
			ex: “Number1 number is greater than Number2 number”
		 */

		double n1=111.111111;
		double n2=111.11111;
		
		if(n1>n2) {
			System.out.println("Number 1: " + n1 + " is greater than Number 2: "+n2);
		}else {
			System.out.println("Number 2: " + n2 + "is greater than Number 1: "+n1);
		}
	}

}
