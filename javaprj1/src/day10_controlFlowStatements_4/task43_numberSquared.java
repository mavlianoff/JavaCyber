package day10_controlFlowStatements_4;

public class task43_numberSquared {

	public static void main(String[] args) {
		
		// Write a Java Program to print the following table.==> get square of given numbers
		
		
		//Solution by me:
//		int iSquared=0;
//		
//		for (int i=1; i<=10; i++) {
//			System.out.print(i + " ");
//			iSquared=i*i;
//			System.out.println(iSquared);
//		}
		
		System.out.println();
		
		
		//solution by instructor:
		System.out.println("Number   Number Squared");
		System.out.println("*************************");
		for (int i=1; i<=10; i++) {
			System.out.println(i + "\t\t" + (i*i));
		}
		
		System.out.println("*************************");
		
	}

}
