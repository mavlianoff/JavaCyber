package day33_ClassObjects_Constructors;

public class MouseTest {
	
	public static void main(String[] args) {
		
		Mouse mouse = new Mouse(15);	// ATTENTION: CONSTRUCTORS ARE CHAINED IN CLASS
		
		mouse.print(); 					// 15 30 20 ==> CONSTRUCTORS ARE CHAINED
		
	}

}
