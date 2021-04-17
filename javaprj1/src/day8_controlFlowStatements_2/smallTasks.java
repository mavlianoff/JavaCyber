package day8_controlFlowStatements_2;

public class smallTasks {

	public static void main(String[] args) {
		
		System.out.println("TASK-1:");
		/*
		1- Write an if-else statement that assigns 20 to variable y if the variable
		x is greater than 100. Otherwise, it should assign 0 to the variable y
		 */

		int x=101;
		int y=20;
		
		if(x>100) {
			y=20;
		}else {
			y=0;
		}
		System.out.println("x = " + x + " " + "y = " + y);
		
		
		System.out.println("*************************");
	
	
	
	
		System.out.println("TASK-2:");
		/*
		2- Write an if-else statement that assigns 1 to x when y is equal to 100.
		Otherwise, it should assign 0 to x.
		 */
		// NOTE: a=>x; b=>y;
		
		int a=125;
		int b=100;
		
		if (b==100) {
			a=1;
		}else {
			a=0;
		}
		System.out.println("a = "+a +" " + " b = "+b);
		
	
		System.out.println("*************************");
		
		System.out.println("TASK-3:");
		/*
		3- Write an if-else statement that assigns 0 to the variable b and assigns
		1 to the variable c if the variable a is less than 10. Otherwise, it should
		assign –99 to the variable b and assign 0 to the variable c
		 */
		
		// NOTE: n1 => a; n2 => b; n3 = c;
		
		int n1=11;
		int n2=5;
		int n3=5;
		
		if (n1<10) {
			n2=0;
			n3=1;
		}else {
			n2=-99;
			n3=0;
		}
		System.out.print("n1= "+n1);
		System.out.print(" n2= "+n2);
		System.out.println(" n3= "+n3);
		
		System.out.println("*************************");
		
		
		
	}

}
