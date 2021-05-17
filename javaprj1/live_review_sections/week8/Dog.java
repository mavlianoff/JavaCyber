package week8;

public class Dog {
	
	public String name, breed, gender, color;
	public int age;
	
	public Dog(String dogName, String dogBreed, String dogGender, String dogColor, int dogAge) {
	// all methods and constructor(special method) targets to generate a function!	
		name = dogName;		//this. refers to object instance
		breed = dogBreed;
		gender = dogGender;
		color = dogColor;
		age = dogAge;
	}
	
	public Dog() {
		
	}
	
	
	
	
	// if anything common in dog objects then static is used, otherwise not needed.
	public void bark() {							//instance method as there is no 'static'
		System.out.println(name + " is barking");
	}


	public String toString() {										// TO PRINT ANY OBJECT - IT REQUIRES toString METHOD!!!!
		return "Dog [name=" + name + ", breed=" + breed + ", gender=" + gender + ", color=" + color + ", age=" + age
				+ "]";
	}
	
	

}
