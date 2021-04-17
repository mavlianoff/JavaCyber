package day7_controlFlowStatements_1;

public class ifStatement {

	public static void main(String[] args) {
		
		int score=55;
		
		if(score>=70) {
			
			System.out.println("Bravoooo!");
			System.out.println("Try to push yourself");
			
		}
		
		System.out.println("**************************");
		
		
		//next example:
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales=5001;
		salary=10000;
		
		if (sales>5000) {
			
			bonus=500;
			commissionRate=1.12;
			
			salary=salary*commissionRate+bonus;
						
		}
		
		System.out.println("Salary = " + salary);
		System.out.println("**************************");
		
		
		
		
		
		



	}

}
