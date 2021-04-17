package day8_controlFlowStatements_2;

public class task35_greatestNumberNestedIf {
	
	public static void main (String[] args) {
		
		int n1=67;
		int n2=73;
		int n3=50;
		
		// Find greatest number with Nested If
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1 + " is the greatest");
		}else {
			if(n2>n3) {
				System.out.println(n2 + " is the greatest");
			}else {
				System.out.println(n3 + " is the greatest");
			}
		}
			
			
	}

}
