package day40_AccessModifiers_Final_Hiding;

public class FinalArray {
	
	public static void main(String[] args) {
		
		final int[] TEAMS = {11,11};
		System.out.println(TEAMS[0]);
		
		TEAMS[0] = 15;					// WE CHANGED FINAL? 'coz objects are referenced in Java, final means, the variable cannot be changed to refer anything else
		System.out.println(TEAMS[0]);
		
		int[] nums = new int[] {20,20,40};
		nums = new int[] {10,15,100};	// no error, perfectly fine, reference can be changed
		
		int[] finalNums = new int[] {23, 44, 66};
		finalNums[0] = 120; 			// no issue at all in changing elements as final impacts only referance
//		finalNums = new int[] {1,2,3,4};	// ERR, 'coz final array wont let to change ref in memory (stack and heap)
		
		//IMPORTANT: same final array rule applies to ArrayList<>
		
		
	}

}
