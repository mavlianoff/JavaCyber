package day16_classObjects_1;

public class task_Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " working");
	}
	
	public void attendMeeting() {
		System.out.println(jobTitle + " attended meeting");
	}
	
	public void introduce() {
		System.out.println("Intorduced average " + salary);
	}

}
