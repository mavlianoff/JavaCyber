package day22_stringManipulation_Lab;

public class StringisEmpty {

	public static void main(String[] args) {
		
		// isEmpty()   => returns true if leght() is 0.
		// isBlank()   => returns true if empty or whitespace

		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		}else {
			System.out.println("Username field is not empty");
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
		
		

	}

}
