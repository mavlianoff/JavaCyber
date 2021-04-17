package day7_controlFlowStatements_1;

public class smallTasks {

	public static void main(String[] args) {

		System.out.println("Small tasks 1");
		//1- Write an if statement that assigns 5 to x when y is equal to 20
		
		int x=10, y=20;
		if (y==20) {
			x=5;
		}
		System.out.println(x + y); //25
		System.out.println("x= "+ x + " y= "+y);
		
				
		System.out.println();
		System.out.println("Small tasks 2");
		//2- Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
		
		double payRate=5000;
		int hour=40;
		if (hour>40) {
			payRate=payRate*1.5;
			
		}
		System.out.println("PayRate = " + payRate);
		
				
		System.out.println();
		System.out.println("Small tasks 3");
		//3- Write an if statement that sets the variable fees to 50 if the Boolean variable max is true
		
		int fee=45;
		boolean max=false;
		if (max==true) { // also correct if (max) {
			fee=50;			
		}
		System.out.println("Fee is " + fee);
		
				
		System.out.println();
		System.out.println("Small tasks 4");
		//4- Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100
		
		int a, b, c;
		a=25;
		b=51; 
		c=100;
		if (b==50 && c>=100) {
			a=20;
		}
		System.out.println("a= " + a);
				
						
		System.out.println();
		System.out.println("Small tasks 5");
		//5- Write an if statement that prints Ideal Temp if the temp is between 70 and 80
		
		int temp=75;
		if (70 < temp & temp < 80) {
			System.out.println("Ideal Temp");
		}

	}

}
