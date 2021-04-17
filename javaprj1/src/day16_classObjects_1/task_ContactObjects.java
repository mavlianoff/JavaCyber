package day16_classObjects_1;

public class task_ContactObjects {

	public static void main(String[] args) {

		task_Contact contact1 = new task_Contact();
		task_Contact contact2 = new task_Contact();
		task_Contact contact3 = new task_Contact();
		
		contact1.name = "Jonny";
		contact1.phoneNumber="1234567823456234567";
		contact1.email = "snmsnasns@gmail.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();

	}

}

//
//String name;
//String phoneNumber;
//String email;
//
//public void call() {
//	System.out.println("Calling " + name);
//}
//
//public void sendMessage() {
//	System.out.println("Sending message to " + name);
//}
//
//public void sendEmail() {
//	System.out.println("Sending email to " + name);
//}

