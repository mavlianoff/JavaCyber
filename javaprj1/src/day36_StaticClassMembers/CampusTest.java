package day36_StaticClassMembers;

public class CampusTest {
	
	public static void main(String[] args) {
		
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country); // As country is statis (therefore shared in memory), UK will be re-write USA in there.
		
		
		
	}

}
