package day10_controlFlowStatements_4;

public class task46_multiplicationTable {

	public static void main(String[] args) {
		/*
		Write a program that the user to declare a positive integer. It should then print the
		multiplication table of that number.
		 */
		
		System.out.println("*******************************");
		int num=9;
		int result=0;
		System.out.println("Multiplication table for " + num);
		System.out.println("*******************************");
		
		for (int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num +" * " + i + " = " + result);
		}
	
		System.out.println("*******************************");
	
	}

}
