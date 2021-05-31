package week10;

public class StudentObjects {
		
	public static void main(String[] args) {
		
		System.out.println( CybertekStudent.schoolName ); 
		System.out.println( CybertekStudent.programmingLanguage );
		//ATTENTION: static variable/member can be called through class name, object creation is not needed
		
		CybertekStudent student1 = new CybertekStudent("Baris", 28, "EU5");
		CybertekStudent student2 = new CybertekStudent("Zina", 25, "EU4");
		System.out.println(student1);
		System.out.println(student2);
		
		
	}
	
}
