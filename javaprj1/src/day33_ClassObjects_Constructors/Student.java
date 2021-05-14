package day33_ClassObjects_Constructors;

public class Student {
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek";  //as it is repeated to all three students we can keep it default for code efficiency purpose
	
	public Student(String name, int age, char gender, int year, String course) { 		// String university => default value is given
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
//		this.university = university; //already assigned to "Cybertek"
	}
	
	//WHEN WE CREATE METHOD IN CLASS WE DO NOT PUT STATIC!!!
	
	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submiting assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab");
	}
	
}
