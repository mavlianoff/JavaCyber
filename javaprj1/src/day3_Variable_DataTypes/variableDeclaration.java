package day3_Variable_DataTypes;

public class variableDeclaration {

	public static void main(String[] args) {
		
		//declaration
		byte inches;
		int speed;
		short month;
		float salesCommission;
		double distance;
		
		//assignment
		inches=5;
		speed=200;
		month=2;
		distance=40.2;
		salesCommission=5;
		
		
		//declaration+assignment
		byte inches2=7;
		System.out.println(inches2);
		
		System.out.println(inches);
		System.out.println(speed);
		
		System.out.println();
		
		//Default print
		System.out.println("My number is 10");
		System.out.println("My number is 15");
		System.out.println("My number is 20");
		
		System.out.println();
		
		//Concatenate print
		int number = 10;
		System.out.println("My number is " + number);
		
	}

}
