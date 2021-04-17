package day9_controlFlowStatements_3;

public class task39_lightColors {
	
	public static void main (String[] args) {
		
		/*
		Write a program to display traffic light colors using following logic:
			if code (R/r)-->"Red"
			if code (O/o)-->"Orange"
			if code (G/g)-->"Green"
		 */
		
		char color='g';
		
		switch (color) {
		case 'R': case 'r':
			System.out.println("Red");
			break;
		case 'O': case 'o':
			System.out.println("Orange");
			break;
		case 'G': case 'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Else-color");
			break;
		
//		case 'R':
//		case 'r':
//			System.out.println("Red");
//			break;
//		case 'O':
//		case 'o':
//			System.out.println("Orange");
//			break;
//		case 'G':
//		case 'g':
//			System.out.println("Green");
//			break;
//		default:
//			System.out.println("Else-color");
//			break;
		
		}
		
	}

}
