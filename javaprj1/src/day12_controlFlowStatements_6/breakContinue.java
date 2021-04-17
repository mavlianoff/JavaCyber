package day12_controlFlowStatements_6;

public class breakContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			if(i==4) {
				break; //try with 'continue'
			}
			System.out.println(i);
		}

	}

}
