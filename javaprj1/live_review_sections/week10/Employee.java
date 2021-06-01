package week10;

public class Employee {
	
	//Declare variables
	public String name,
	              gender,
	              jobTitle;
	
	public int emloyeeID;
	public double salary;
	public static boolean isEmployee = true;
	
	//Initialize (instance) variables
	public Employee(String name, String gender, String jobTitle, int emloyeeID, double salary) {
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.emloyeeID = emloyeeID;
		this.salary = salary;
	}
	
	//Methods 1-2-3
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	public void work() {
		System.out.println(name + " is working");
	}

	// Generate toString() method to output
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", jobTitle=" + jobTitle + ", emloyeeID=" + emloyeeID
				+ ", salary=" + salary + "]";
	}
	// IMPORTANT: toString method can also be inherited as instance method to subclasses/child
	
	
	

}

