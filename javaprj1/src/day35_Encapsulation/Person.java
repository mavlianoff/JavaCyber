package day35_Encapsulation;

public class Person {
	
	private String name; // changed from public to private as best practice tip
	private int age;
	private char gender; // changed from public to private as best practice tip
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	

}
