package day8_controlFlowStatements_2;

public class task32_largestNumber {

	public static void main(String[] args) {
		/*
		• Declare 3 numbers
		• Program should display which one is largest
		 */
		
		int x=11, y=11, z=11;
		
		if (x>y && x>z) {
			System.out.println("Variable x: " + x + " is the largest of three");
		}else if (y>x && y>z) {
			System.out.println("Variable y: " + y + " is the largest of three");
		}else if (z>x && z>y) {
			System.out.println("Variable z: " + z + " is the largest of three");
		}else {
			System.out.println("Numbers are equal");	
		}
	}
}
