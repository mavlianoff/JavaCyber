package week10;

public class Tester extends Employee {		
	// ERROR: child cannot inherit parent constructor. Also constructor & class name must be identical
	// Child MUST call parent constructor manually if parent generated constructor manually, not default
	
	public Tester(String name, String gender, String jobTitle, int emloyeeID, double salary) {
		// super() is the keyword to call parent constructor. Exact same as this.name in parent constructor
		super(name, gender, jobTitle, emloyeeID, salary);
	}
	
	public void smokeTesting() {
		System.out.println(name + " is smokeTesting");
	}
	
	public void createTicket() {
		System.out.println(name + " is creating Ticket");
	}
	
	//toString is inherited from Parent
	
	
}
