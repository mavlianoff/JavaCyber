package day43_Polymorphism;

public class IPad extends AppleDevice{
	
	@Override
	public void use() {
		System.out.println("IPad | ReadBoook");
	}
	
	public void draw() {
		System.out.println("Drawing shapes using IPad");
	}

}
