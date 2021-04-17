package day9_controlFlowStatements_3;

public class orLogicWithSwitch {

	public static void main(String[] args) {
		
		// A or B or C => Pass
		// D or E or F => Fail
		
		char grade='A';
		
		switch(grade) {
		
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("Fail");
			break;
			
		}
				

	}

}
