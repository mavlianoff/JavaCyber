package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrumteam {
	
	public String PO, BA, SM;
	
	public ArrayList<Tester> testers = new ArrayList<>();
	public ArrayList<Developer> developers = new ArrayList<>();
	
	public Scrumteam(String pO, String bA, String sM) {
		PO = pO;
		BA = bA;
		SM = sM;
	}
	
	public void addTester(Tester tester) {		// adds one tester to testers ArrayList
		testers.add(tester);
	}
	
	public void addTester(Tester[] testers) {
//		testers.add() 										==> testers referred to local variable, therefore, 
//		this.testers.addAll(testers);						==> this.testers referred to instance arraylist but (testers) - local var
		this.testers.addAll(Arrays.asList(testers));	//	==> since addAll method requires collection, we have to convert it to Arraylist
	}
	
	public void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	public void addDeveloper(Developer[] developers) {
		this.developers.addAll(Arrays.asList(developers));
	}

	
	public String toString() {
		return "Scrumteam [PO=" + PO + ", BA=" + BA + ", SM=" + SM + ", testers=" + testers.size() + ", developers="
				+ developers.size() + "]";
	}
	
	
}
