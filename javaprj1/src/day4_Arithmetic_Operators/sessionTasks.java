package day4_Arithmetic_Operators;

public class sessionTasks {

	public static void main(String[] args) {
		
		// Task 13
		int num1=46, num2=90, sum;
		
		sum=num1+num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		//Task 14
//		F = 9 * C / 5 +32;
		double F, C=99.9;
		F=9*C/5+32;
		
		System.out.println(C + " Celcius is equal to " + F + " fahrenheit");
		
		//Task 15
		double mi=85.0, km;
		km=mi*1.609344;
		
		System.out.println(mi + " is equal to " + km + " km");
		
		//Task 16
		double radius=5.5, perimeter, area;
		final double PI=3.14; //Math.PI can be used instead of declaring hard variable
				
		perimeter=2*radius*PI;
		area=radius*radius*PI;
		
		System.out.println("Perimeter of the cicle:	" + perimeter);
		System.out.println("Area of the cicle:	" + area);
		
		//Task 17
		int n1=10, n2=12, n3=23;
		double average=(n1+n2+n3)/3;
		
		System.out.println("Average value is: " + average);

	}

}
