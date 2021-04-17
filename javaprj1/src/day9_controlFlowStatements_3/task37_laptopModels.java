package day9_controlFlowStatements_3;

public class task37_laptopModels {
	
	public static void main(String[] args) {
		
		/*
		Write a program that lets user to enter apple,dell,acer laptop models
		If it is apple show “Apple-no virus”
		If it is dell show “Tough one”
		If it is acer show “Not recommended”
		Else “do not buy that one!”
		 */
		
		String model="Toshiba";
		
		switch(model) {
		
		case "Apple":
			System.out.println("Apple - no virus");
			break;
		case "Dell":
			System.out.println("Tough one");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy that one!");
			break;	
			
		}
		
		
	}

}
