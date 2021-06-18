package day41_Abstraction;

//public class Animal {
public abstract class Animal {					// keyword abstract makes it mandatory to do implement in sub classes
	
	String name;						// we can have static or instance variables in abstract class
	static int id;						// variables cannot be abstract
	
	
	public Animal() {					// Although we CANNOT create object, we still can create constructor
		
	}
	
	
//	public void eat() {							// there is no point of having class without any implementation
//		//no implementation in this block
//	}

	public abstract void eat(String X);			// abstract method, you can put parameter but it has no meaning
	
	public abstract void breath();				// abstract method		
	
	public void moving() {						// instance method
		System.out.println("Moving");
	}
	
	
	// we can have static block
	static {
		
	}
	
	// we can have instance block
	{
		
	}
	

}

