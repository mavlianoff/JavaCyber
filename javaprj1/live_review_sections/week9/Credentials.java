package week9;

public class Credentials {
	
	private String username, password;				// from 'public' to 'private'
	
	//GETTER - Username
	public String getUsername() {					// READ ONLY, instance vs void
		return username;
	}

	//SETTER - Username
	public void setUsername(String username) {
		if(username.length() < 8) {
			System.err.println("need to be at least 8 chars");
			return; // to exit method if condition is true
		}
		
		if(!username.endsWith("@gmail.com")) {
			System.out.println("must end with @gmail.com");
			return;
		}
		
		this.username = username;
		
		
	}

	//GETTER - Password
	public String getPassword() {
		return password;
	}

	//SETTER - Password
	public void setPassword(String password) {
		if(!Character.isLetter(password.charAt(0) )) {
			System.err.println("Must start with letter");
			return;
		}
		this.password = password;
	}
}
