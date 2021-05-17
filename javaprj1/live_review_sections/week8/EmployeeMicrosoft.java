package week8;

public class EmployeeMicrosoft {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Jack", "Accountant", 503124897, 150000);
		System.out.println(emp1);
		
		//Employee is NOT primitive. Array support object!!!
		Employee[] accountants = { 	new Employee("Jack", "Accountant", 123, 95000),
								new Employee("Jeck", "Accountant2", 124, 110000),
								new Employee("Jick", "Accountant3", 125, 120000),
								new Employee("Jock", "Accountant4", 126, 132000)   };
		
		double maxSalary = 0;
		double minSalary = Double.MAX_VALUE;  // maximum value a double can represent (somewhere around 1.7*10^308)
		
		for(Employee each: accountants) {
			
			if(each.salary > maxSalary) {
				maxSalary = each.salary;
			}
			
			if(each.salary < minSalary) {
				minSalary = each.salary;
			}
			
			
		}
		System.out.println("max: " + maxSalary);
		System.out.println("min: " + minSalary);
		
		
	}
	
	
}
