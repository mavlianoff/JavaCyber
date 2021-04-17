package day11_controlFlowStatements_5;

public class task49_stairStep {

	public static void main(String[] args) {
		/*
		Write a Java program to create a stair step pattern
		_#
		 _#
		  _#
		   _#
		    _#
		     _#
		 */

		int rows=6;
//		int columns=5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j); // should be (" ") => space
			}
			System.out.println("#");
		}
		
	}

}
