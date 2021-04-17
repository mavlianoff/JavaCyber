package day14_methods_2;

public class JavaIsPassByValue {

	public static void main(String[] args) {

		int age=11; //pass-by-value doesn't change
		addOne(age);
		System.out.println("Value of age: " + age);

	}
	
	public static void addOne(int x) {
		x=x+1;
		System.out.println("Value of x: " + x);
	}

}
