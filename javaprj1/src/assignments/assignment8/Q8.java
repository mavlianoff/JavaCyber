package assignments.assignment8;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		/*
		Complete a method fib() that will compute Fibonacci numbers
		In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
		Given a number num, print n-th Fibonacci Number.
		
		Input : 2
		Output : 1
		
		Input : 9
		Output : 21
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input: ");
		
		fib(scan.nextInt());
		scan.close();
		

	}
		
	public static void fib(int num) {
		int firstNum =0;
		int secondNum = 1;
		int i = 1;
		
		while(i<num) {					
			
			int third = firstNum+secondNum;
			i++;
			firstNum=secondNum;
			secondNum=third;			
			
		}	
		
		System.out.println("Output: " + firstNum);
		
	}

}
