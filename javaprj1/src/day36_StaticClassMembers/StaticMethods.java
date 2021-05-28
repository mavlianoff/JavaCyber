package day36_StaticClassMembers;

public class StaticMethods {
	
	static 	String name = "Apple";
			int age = 10;
	
	public static void show1() {		// static method
//		show2();	// you cannot call instance method/variable from static method
		show4();	// you can call static method from static method
		System.out.println(name);
//		System.out.println(age);
	}
	
	public void show2() {				// instance method
		show4();	// you can call static method from instance method
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {				// instance method
		show2();
		show1();
	}
	
	public static void show4() {		// static method
		
	}
	
	
	

}
