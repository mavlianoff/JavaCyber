package assignments.assignment8;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		/*
		Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
		Do not convert int into a string!
		Example:
		input: 1001
		output: true
		
		Example:
		input: 1234
		output: false
		 */
		
		isPalindrome();

	}
	
	public static void isPalindrome() {
		int r=0, rem, num;
		Scanner s = new Scanner(System.in);
		System.out.print("Input:");
		num = s.nextInt();
		
		//Store the number in a temporary variable
		int temp = num;
		
		//loop to find the reverse of a number
		while( num != 0 )
		{
		rem= num % 10;//4
		r= r * 10 + rem;//4
		num=num/10;//45
		}
		//check whether the original and reversed numbers are equal
		if (temp == r)
		{
		System.out.println("Output: " + true);
		
		}
		else
		{
		System.out.println("Output: " + false);
		}
	}

}