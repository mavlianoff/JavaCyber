package day41_Abstraction;

public class Dog extends Animal{ 				// ERR due to abstract methods created in parent class therefore implement needed for methods

	public Dog() {
		super();
	}
	
	
	@Override
	public void eat(String X) {
		System.out.println("Dog is eating");
	}

	@Override
	public void breath() {
		System.out.println("Dog is breathing");
	}   
	
	
	

	
	
}
