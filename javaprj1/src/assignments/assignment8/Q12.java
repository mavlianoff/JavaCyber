package assignments.assignment8;

public class Q12 {

	public static void main(String[] args) {
		
		/*
		The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
		the hamletQuote method only returns true if one of or both of the boolean parameters is true.
		
		example:
		
		hamletQuote(true, false)
		returns true
		
		hamletQuote(false,true)
		returns true
		
		hamletQuote(true,true)
		returns true
		
		hamletQuote(false,false)
		returns false
		
		hint: use the truth table for this one, this can be done with one if and a logical operator.
		 */
		
		System.out.println(hamletQuote(true,false));
		System.out.println(hamletQuote(false,false));

	}
	
	public static boolean hamletQuote(boolean q1, boolean q2) {
		
		if (q1 == true || q2==true) {
			return true;
		}else {
			return false;
		}
	}

}