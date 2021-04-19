package day22_stringManipulation_Lab;

public class Lab3_Q1_helloName {

	public static void main(String[] args) {
		/*
		Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello Bob!".
		
			helloName("Bob") → "Hello Bob!"
			helloName("Alice") → "Hello Alice!"
			helloName("X") → "Hello X!"
		 */
		
		helloName("Bob");
		System.out.println(helloName("Bob"));
		helloName("Alice");
		System.out.println(helloName("Alice"));
		helloName("X");
		System.out.println(helloName("X"));

	}
	
	public static String helloName(String name){
		return "Hello ".concat(name).concat("!");

	}

}
