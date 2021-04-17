package day7_controlFlowStatements_1;

public class task25_greatestNumber {

	public static void main(String[] args) {
		/*
		 Write Java program that will accept three numbers and return the greatest number.

		• Input:
		Enter first number: 4
		Enter second number: 8
		Enter third number: 1

		• Output:
		The greatest number is: 8
		 */
		
		int n1=4, n2=8, n3=1;
		if(n1>n2 && n1>n3) {
			System.out.println("The greatest number is " + n1);
		}
		
		if (n2>n1 && n2>n3) {
			System.out.println("The greatest number is " + n2);
		}
		
		if (n3>n1 && n3>n2) {
			System.out.println("The greatest number is " + n3);
		}

	}

}
