package day37_Inheritance;

public class School {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 25;
		person.gender = 'M';
		
		student.name = "Smith";
		student.age = 30;
		student.gender = 'M';
		
		student.StudentID = 1110;
		
		person.eat("Steak");
		student.eat("Pizza");
		
//		person.code("Java"); //method doesn't belong to parent but to child
		student.code("Java");
		
	}
	
}
