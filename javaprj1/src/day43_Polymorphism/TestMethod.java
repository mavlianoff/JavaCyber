package day43_Polymorphism;

public class TestMethod {
	
	public static void main(String[] args) {
		
		ChildA chA = new ChildA();
		chA.m1();				//inherited		
		chA.m2();				//overriden from Interface (Abstraction)
		chA.m3();				//class method
		
		ChildB chB = new ChildB();
		chB.m1();				//inherted
		chB.m2();				//overrride from Interface (Abstraction)
		chB.m4();				//class method
		
		Parent p1 = new ChildA();
		p1.m1(); 				//Only defined and overriden method from Parent class (Ref Type)
		
		MyInterface int1 = new ChildA();
		int1.m2(); 				//Only defined and overriden method from Interface (Ref Type)
		
		MyInterface int2 = new ChildB();
		int2.m2(); 				//Only defined and overriden method from Interface (Ref Type)
		
	}
	
}

class Parent{
	public void m1() {}
}

interface MyInterface{
	void m2();
}

class ChildA extends Parent implements MyInterface{
	public void m2() {};
	public void m3() {};
}

class ChildB extends Parent implements MyInterface{
	public void m2() {};
	public void m4() {};
}