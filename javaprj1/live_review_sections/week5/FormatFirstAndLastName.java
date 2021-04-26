package week5;

import java.util.Scanner;

public class FormatFirstAndLastName {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fname = scan.next();
		fname = fname.substring(0,1).toUpperCase() + fname.substring(1).toLowerCase();
		
		System.out.println("Please enter your second name: ");
		String sname = scan.next();
		sname = sname.substring(0,1).toUpperCase() + sname.substring(1).toLowerCase();
		
		System.out.println("Applicant full name: " + fname + " " + sname);

//		String initials = fname.charAt(0) + sname.charAt(0); //This will gove error to change to int therefore, see below
		String initials = "" + fname.charAt(0) + sname.charAt(0); // "S" + 'M'
		System.out.println("Applicant initials: " + initials);
		
		
	}

}
