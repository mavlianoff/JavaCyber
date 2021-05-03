package week6;

public class BranchingStatements {
	
	public static void main(String[] args) {
		
		// continue: 	skip iteration of loop
		// break: 		exits loop & switch
		// return:		exits method
		//System.exit(0):	exits system (due to incorrect code)
		
		for(int i=0; i<=5; i++) {
			System.out.println("HellO World!");
//			break; 									//exits loop on first iteration
//			return;									//exits (main) method, anything after this line will not be executed
			System.exit(0);							// terminated entire system i.e. everything.
		}
		
		System.out.println("Test completed!");
		
	}

}
