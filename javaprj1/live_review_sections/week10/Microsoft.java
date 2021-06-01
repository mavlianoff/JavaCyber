package week10;

public class Microsoft {
	
	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Alperen", "Male", "SDET", 1231, 100000);
		Tester tester2 = new Tester("Mirjam", "Female", "SDET", 1232, 98000);
		Tester tester3 = new Tester("Cactus", "Male", "SDET", 1233, 105000);
		
		Tester[] testers = {tester2, tester3};
		
		Developer developer1 = new Developer("Akhtam", "Male", "Java Developer", 1241, 120000);
		Developer developer2 = new Developer("Seyma", "Female", "C++ Developer", 1242, 121000);
		Developer developer3 = new Developer("Gulsah", "Female", "Python Developer", 1243, 122000);
		Developer developer4 = new Developer("Aiden", "Male", "Java Developer", 1244, 123000);
		
		Developer[] developers = {developer2, developer3, developer4};
		
		System.out.println(tester1);
		System.out.println(developer1);
		
		tester1.createTicket();
		developer1.coding();
		
		//===============//===========================//=======================
		
		Scrumteam scrum1 = new Scrumteam("Omer", "Rasim", "Zeynep");

		scrum1.addTester(tester1);	// one tester
		scrum1.addTester(testers);	// array of testers
		System.out.println("Total number of testers: " + scrum1.testers.size());
		
		scrum1.addDeveloper(developer1);
		scrum1.addDeveloper(developers);
		System.out.println("Total number of testers: " + scrum1.developers.size());
		
		System.out.println(scrum1);
		
	}

}
