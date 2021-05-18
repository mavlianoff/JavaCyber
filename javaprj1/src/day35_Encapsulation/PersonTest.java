package day35_Encapsulation;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.name = "Mike";		// best practice: keep it private
//		p.gender = 'M';
//		p.age = -10				// As age cannot be negative, we have ti cut public access to class attribute to private
		
		p.setAge(20);
		System.out.println(p.getAge());
		
		
		
		//ENCAPSULATION ()
			// 1- CUT THE ACCESS - PRIVATE						==> Private variables
			// 2- CREATE SETTER METHOD TO INITIALIZE MY VALUE	==> Public setter methods
			// 3- CREATE GETTER METHOD TO RETRIEVE VALUE		==> Public getter methods
		
	}
	
	
}
