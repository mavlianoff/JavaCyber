package day8_controlFlowStatements_2;

public class task31_sumTriangle {

	public static void main(String[] args) {
		
		/*
		A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
		program that declares three integers as angles and check whether a triangle is valid or not.
		 */

		int angle1=0, angle2=0, angle3=0;
		
		if((angle1+angle2+angle3)==180) {
			System.out.println("It is valid triangle!");
		}else {
			System.out.println("It is not valid triangle!");
		}
	}

}
