package assignments.ArithmeticOperators;

public class question2 {

	public static void main(String[] args) {
		/*
		Write a program - > Declare variables for your name and birth year, and the program will display:

      " Hello, Ozzy! Based on your input, your age is 15 :) "
		 */
		
		String name="Sanzharbek";
		int birthYear=1989;
		int currentYear=2021;
		int age=currentYear-birthYear;
		
		System.out.println("Hello " + name + "! Based on your input, your age is " + age);

	}

}
