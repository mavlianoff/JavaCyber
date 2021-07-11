package day45_exceptions;

public class ThrowAndThrows {
	
	public static void main(String[] args){
		
		System.out.println("Hello World!");
		
//		throw new RuntimeException("This is some exception");
		
		try {
			throw new Exception("Another exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String username = "";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name cannot be empty");
		}else {
			System.out.println("Valid username");
		}
		
		
//		sleep3(2); 		//ERR
		
		try {
			sleep3(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}

}
