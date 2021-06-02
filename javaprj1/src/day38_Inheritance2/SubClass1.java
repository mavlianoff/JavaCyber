package day38_Inheritance2;

public class SubClass1 extends SuperClass1 {
	
	//IMPORTANT: super() and this() CANNOT be in the same code block at the same time
	
	public SubClass1() {
//		super()													// auto-calling (by JVM) parent constructor with no parameters
		super(5);												// calling constructors from parents class
//		this(5);												// calling constructors within child class
		System.out.println("This is the subclass constructor");
	}
	
//	public SubClass1(int x) {
//		System.out.println(x);
//	}
	
	

}
