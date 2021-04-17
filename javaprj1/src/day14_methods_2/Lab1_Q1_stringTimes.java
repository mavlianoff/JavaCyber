package day14_methods_2;

public class Lab1_Q1_stringTimes {

	public static void main(String[] args) {
		/*
		
		Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

		stringTimes("Hi", 2); = > HiHi  //immediately loop as it states, x2 or x3 or x4
		stringTimes("Hi", 3); = > HiHiHi
		stringTimes("Hi", 1); = > Hi

		 */
		
		stringTimes("Hi", 4);

	}
	
	public static void stringTimes(String string, int numberOfTimes) {
		
		String str="";
		for(int i=1; i<=numberOfTimes; i++) {
			str=str+string;
		}
		System.out.println(str);
		
	}

}
