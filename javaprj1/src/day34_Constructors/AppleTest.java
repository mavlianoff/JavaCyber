package day34_Constructors;

public class AppleTest {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		
		changeApple(a1);
		
		System.out.println(a1.color);
		
		System.out.println(methodObject().color);
	}
	
	// IMPORTANT: We are aiming to introduce object/reference/class name in methods
	
	public static void changeApple(Apple x) {
		
//		color = "White"; 
						// error as it is local variable which never been declared
						// in order to access to instance variable, we shall follow object creation
		
//		Apple a1 = new Apple(); 	// moved to main method
		x.color = "White";
		
	}
	
	// IMPORTANT: returning type as class name
	public static Apple methodObject() {
		Apple b1 = new Apple();
		return b1;
	}
	
	
}
