package day8_controlFlowStatements_2;

public class task33_failPassScore {

	public static void main(String[] args) {
		/*
		Write a Java Program for the following logic:
		§ If marks < 60, then print “Fail”
		§ If marks >= 60, but less than 90, then print “Pass”
		§ If marks >= 90, then print “Passed with Distinction”
		 */
		
		int mark=105;
		
		if (mark<60) {
			System.out.println("FAIL");
		}else if (mark>=60 && mark<90) {
			System.out.println("PASS");
		}else if (mark >=90 && mark <= 100) { //added (&& mark<=100) condition to set upper boundary
			System.out.println("PASS+");
		}else {
			System.out.println("You big Cheat!");
		} 

	}

}
