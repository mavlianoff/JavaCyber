package day36_StaticClassMembers;

public class CalculatorTest {
	
	public static void main(String[] args) {
		
		//1-way as static allows to call method directly from class
		double result = Calculator.plus(55, 7); // static way
		System.out.println("Result:" + result);
		
		//2-way as conventionally
		Calculator c = new Calculator();
		System.out.println("Result:" + c.plus(55, 7));
		
		//Calling method m1:
		m1();										// we are in the same class
		CalculatorTest.m1();						// can be called through class name too
		CalculatorTest c1 = new CalculatorTest();	// can be called through creating object too
		c1.m1();
		// all this can be done as method is 'static'
		
	}
	
	public static void m1() {
		System.out.println("Hello!");
	}

}
