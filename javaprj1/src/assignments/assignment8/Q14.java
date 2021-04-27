package assignments.assignment8;

public class Q14 {

	public static void main(String[] args) {
		
		/*
		This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

		It returns true only if both a and b are true or c is true.
		
		https://en.wikipedia.org/wiki/Truth_table
		 */
		
		System.out.println(threeLocks(true,false,true));
		System.out.println(threeLocks(true,false,false));
		System.out.println(threeLocks(true,true,false));

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if (a==true && b==true || c==true) {
			return true;
		}else {
			return false;
		}
	}

}