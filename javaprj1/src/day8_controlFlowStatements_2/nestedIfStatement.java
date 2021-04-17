package day8_controlFlowStatements_2;

public class nestedIfStatement {
	
	public static void main (String[] args) {
		
		double salary=3000;
		int yearsOnJob = 1;
		
		System.out.println("Salary: " + salary);
		System.out.println("Work Exprience: " + yearsOnJob);
		
		if(salary>=3000) {
			if(yearsOnJob>=2) {
				System.out.println("You are eligibe to loan");
			}else {
				System.out.println("You must have at least 2 years of work experience");
			}
		}else {
			System.out.println("You must earn at least USD3,000");
		}
	}

}
