package day40_AccessModifiers_Final_Hiding;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("Method-1");
	}
	
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
	}

}

class Sub extends FinalMethods{
	
//	@Override
//	public void method1() {								// final method cannot be @Overrride
//		System.out.println("Method-1 ins subclass");
//	}
	
//	public static void staticMethod(String word) {		// final, method cannnot be @Override, reason coming
//		System.out.println("Static Method in sub class");
//	}
}
