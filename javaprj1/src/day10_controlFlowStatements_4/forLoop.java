package day10_controlFlowStatements_4;

public class forLoop {

	public static void main(String[] args) {

		for (int i=0; i<3; i++) {
			System.out.println("Hello!");
		}
		
		// i	condition	action		increment(i++) i=i+1
		// 0	TRUE		print		1
		// 		..			..			..
		//		TRUE		print		5
		//		FALSE		
		
		for (int j=1; j<=3; j++) {
			System.out.println("j = " +j);
		}
		
		for (int k=20; k>=16; k--) {
			System.out.println("k = " + k);
		}
		
		for(int m= 0; m<=100; m+=10) {
			System.out.println("m = " + m);
		}
		
		for (int n=50; n>=10; n-=10) {
			System.out.println("n = " + n);
		}
		

	}

}
