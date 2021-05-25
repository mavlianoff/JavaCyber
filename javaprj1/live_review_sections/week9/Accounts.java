package week9;

public class Accounts {

	public static void main(String[] args) {
		
		Credentials google = new Credentials();
//		google.username = "123";					
//		google.password = "9876";					
										/*
										Above two code lines are only accessible in 'public'(in class Credentials).
										Also, while it is 'public', anyone can type in anything without any restrictions.
										Therefore, if you would like to set some username and password rules, 
										ex, 8 characters, special characters, etc, 'private' access needed
										*/ 
		
//		System.out.println( google.username); 		// not accessible
//		System.out.println( google.getUsername()); 	// accessible even with 'private'
		
		google.setUsername("cybertekschool@gmail.com");
		System.out.println(google.getUsername());
		
		google.setPassword("A234543456543456");
		System.out.println(google.getPassword());
		
		
	}
	
}
