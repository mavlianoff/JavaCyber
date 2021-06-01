package week10;

public class Developer extends Employee{
	
	//IF PARENT CONSTRUCTOR IS NOT DEFAULT, WE HAVE TO CALL IT MANUALLY - SEE BELOW CONTRUCTOR LINES

	public Developer(String name, String gender, String jobTitle, int emloyeeID, double salary) {
		super(name, gender, jobTitle, emloyeeID, salary);
	}
	
	public void coding() {
		System.out.println(name + " is coding");
	}
	
	public void fixingBug() {
		System.out.println(name + " is crying");
	}
	
	//toString() method is inherited from parent class
}
