package week5;

public class SalaryObjects {
	
	public static void main(String[] args) {
		
		Salary salary1 = new Salary();
//		System.out.println(salary1); //i can print it because i have set toString() method in class
		salary1.setInfo(25, 40, 0.27); //employee1
		System.out.println(salary1); //i can print it because i have set toString() method in class
		
		Salary salary2 = new Salary(); //employee2
		salary2.setInfo(55, 45, 0.28);
		System.out.println(salary2);
		
		salary2.setInfo(65, 45, 0.28); //employee2 got promoted
		System.out.println(salary2);
		
		
		
		
		
	}

}
