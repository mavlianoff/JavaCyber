package day8_controlFlowStatements_2;

public class switchCase {
	
	public static void main (String[] args) {
		
		String weather="sunny";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break; // try commenting this line as it will allow code to run in the next case
		
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		
		case "snowy":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		
		default:
			System.out.println("Code Java in any other weather");
		}
		
	}

}
