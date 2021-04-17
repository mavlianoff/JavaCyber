package day8_controlFlowStatements_2;

public class task36_switchCalculator {

	public static void main(String[] args) {
		
		// Write a program that creates a calculator by using switch statements
		
		int n1=10, n2=11;
		String operator=",";
		double result=0;
		
		switch(operator) {
		
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
			break;
		default:
			System.out.println("Invalid operator");
		}
		System.out.println("Result: " + result);
	}

}
