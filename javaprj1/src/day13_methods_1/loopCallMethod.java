package day13_methods_1;

public class loopCallMethod {

	public static void main(String[] args) {
		
		System.out.println("hello from the main method");
		for(int i=0; i<5; i++) {
			displayMessage();
			System.out.println("back in the main method");
		}

	}

	public static void displayMessage() {
		System.out.println("Hello from displayMessage method");
		
	}

}
