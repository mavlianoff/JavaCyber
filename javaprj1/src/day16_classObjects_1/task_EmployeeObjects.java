package day16_classObjects_1;

public class task_EmployeeObjects {

	public static void main(String[] args) {
		
		task_Employee empl1 = new task_Employee();
		
		empl1.name="Aly";
		empl1.jobTitle="AI Engineer";
		empl1.salary=130000;
		
		System.out.println(empl1.name);
		
		empl1.name="Ally";
		
		System.out.println(empl1.name);
		
		empl1.work();
		empl1.attendMeeting();
		empl1.introduce();

	}

}

//String name;
//String jobTitle;
//double salary;
//
//public void work() {
//	System.out.println(name + " working");
//}
//
//public void attendMeeting() {
//	System.out.println(jobTitle + " attended meeting");
//}
//
//public void introduce() {
//	System.out.println("Intorduced average " + salary);
//}

