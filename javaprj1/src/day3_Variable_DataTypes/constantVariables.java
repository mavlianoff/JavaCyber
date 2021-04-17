package day3_Variable_DataTypes;

public class constantVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI=3.14;
		PI=3.15;
		PI=3.16;

		System.out.println(PI); //prints last value of PI variable
		
		System.out.println();
		
		final double MI=3.14;
//		MI=3.15;
//		MI=3.16;

		System.out.println(MI); //prints original value as it is final, i.e. fixed with 'final'
				
				

	}

}
