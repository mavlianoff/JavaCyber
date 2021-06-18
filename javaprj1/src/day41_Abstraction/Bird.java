package day41_Abstraction;

public class Bird extends Animal{
//public abstract class Bird extends Animal{ 			// OPTIONAL

	public Bird() {
		super();
	}
	
	
	@Override
	public void eat(String X) {
		System.out.println("Bird is eating");
		
	}

	@Override
	public void breath() {
		System.out.println("Bird is breathing");
		
	}
	
	
	
	
	

}
