package assignments.day3;

public class question5 {

	public static void main(String[] args) {
		
		/* Declare and initialize two variables called first and second. Write a single statement that will 
		 * print the message "first is " 
		 * followed by the value of first, 
		 * and then space, 
		 * followed by "second = ", followed by the value of the second.
		 * Ex: first is 55 second = 123																		*/
		
		int first=55, second=123;
		
		//Concatenate printing:
		System.out.println("first is " + first + " " + "second= " + second);
		
		//Alternative printing:
		System.out.print("first is " + first);
		System.out.print(" ");
		System.out.println("second= " + second);
		


	}

}
