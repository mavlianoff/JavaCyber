package day20_stringManipulation_2;

public class StringIndexOf2 {

	public static void main(String[] args) {

		// index of with 2 values
		
		String list="html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");	// 4
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", 5); // finds second dash from index 5 forward.
		System.out.println(secondDash);
		
		int thirdDash=list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
//		int lastDash=list.indexOf("-", thirdDash+1);
		int lastDash=list.lastIndexOf("-");				//NEW METHOD!!!
		System.out.println(lastDash);
				

	}

}
