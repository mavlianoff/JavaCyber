package day43_Polymorphism;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		//POLYMORPHISM: when reference type is parentclass/interface and object type is child class
		

//		REF TYPE    REF NAME	OBJECT TYPE

		Animal	 	a = 		new Animal();
		Animal 		b = 		new Dog();
		Animal 		c = 		new Bird();
		
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Bird();
		
		
	}

}

class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}

