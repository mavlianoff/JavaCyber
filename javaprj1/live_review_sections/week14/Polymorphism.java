package week14;

import week13.Animal;
import week13.Dog;
import week13.Lion;

public class Polymorphism {
	
	public static void main(String[] args) {
		int b = 10;
		double a = b; // implicit casting
		
		
		short s =  (short)a; // explicit casting
		
		
		System.out.println("---------------------------------------");
		// reference type casting: upcasting & downcasting
		
		Animal animal1 =  new Dog(); //up casting
	//	Animal animal1 =  (Animal) (new Dog());
		
		//animal.bark();			 // reference type decides
		
		
		Dog dog = (Dog)animal1; // down casting
		dog.bark();					// reference type decides
		
		
	//Lion lion = (Lion)animal1;				//animal1 is new Dog() object, dog cannot be lion. There is no IS A relationship, NO POLYMORPHISM
	//	lion.hunting();
		//EXCEPTION: ClassCastException is when there is no IS A relationship
		
		
		//DOWNCASTING IN PRACTICE
		//screenshot method is not available in Webdriver but ChromeDriver does
		/*
		 WebDriver driver = new Chrome();
		 (chrome) driver
		 */
		
		
		
	}

}