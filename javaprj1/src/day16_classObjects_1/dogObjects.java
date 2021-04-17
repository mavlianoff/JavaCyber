package day16_classObjects_1;

public class dogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.age=10;
		dog1.color="Red";
		dog1.breed="Maltese";
		dog1.name="Rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.name);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		

	}

}
