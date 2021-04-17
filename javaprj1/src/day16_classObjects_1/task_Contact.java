package day16_classObjects_1;

public class task_Contact {
	
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling " + name);
	}
	
	public void sendMessage() {
		System.out.println("Sending message to " + name);
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + name);
	}

}
