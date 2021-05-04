package day27_Arrays_part4;

public class Teams {
	
	public static void main(String[] args) {
		
		//Assign one by one
//		String[][] teams = new String[2][3];
		
//		teams[0][0] = "Terry";
//		teams[0][1] = "Mason";
//		teams[0][2] = "Loftus";
//		
//		teams[1][0] = "David";
//		teams[1][1] = "Hazard";
//		teams[1][2] = "Lamps";
		
		//Instantiate with ={}
		String[][] teams = {  {"Terry", "Mason", "Loftus"},  {"David", "Hazar", "Lamps"}   };
		
		System.out.println("First player of first team is: " + teams[0][0]);
		
		System.out.println("Number of array rows: " + teams.length);
		System.out.println("Team1 squad size: " + teams[0].length);
		System.out.println("Team1 squad size: " + teams[1].length);
	}

}
