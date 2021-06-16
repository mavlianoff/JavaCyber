package day40_AccessModifiers_Final_Hiding;

public class MethodHidingTest {
	
	public static void main(String[] args) {
			
		
	}

}

class Bear{
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernate");
	}
}

class Panda extends Bear{
	
	public static void eat() {						// Hiding, no annotation for hiding
		System.out.println("Panda is eating");
	}
	
//	public void sneezing() {						// ERR, as parent method is static this also should be static method, vice versa
//		System.out.println("Panda is sneezing");
//	}
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}