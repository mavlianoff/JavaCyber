package day4_Arithmetic_Operators;

public class wageCalculation {

	public static void main(String[] args) {
		
		double regularWage;
		double basePay=25;
		double regularHours=40;
		
		double overTimeWage;
		double overTimePay=37.5; //1.5xBasePay
		double overTimeHours=15;
		
		double totalWage;
		
		regularWage=basePay*regularHours;
		overTimeWage=overTimePay*overTimeHours;
		
		totalWage=regularWage+overTimeWage;
		
		System.out.println("Wages for this week are $ "+totalWage);

	}

}
