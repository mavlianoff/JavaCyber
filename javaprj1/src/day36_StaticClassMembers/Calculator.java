package day36_StaticClassMembers;

public class Calculator {
	
	public static double plus(double num1, double num2) {
		return num1+num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1*num2;
	}
	
	//NOTE: why static method?
	
	// answer comes from following question outcome: are we declaring any instance variable at the top (ex: int num) and using it inside any method?
	// if yes, static keyword must be removed from method(s)
	// if no, static keyword must be included in method structure

}
