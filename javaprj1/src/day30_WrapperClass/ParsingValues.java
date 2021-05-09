package day30_WrapperClass;

public class ParsingValues {
	
	public static void main(String[] args) {
		
		String numberAsString = "2018";
		System.out.println(numberAsString);
		
		int number1 = Integer.parseInt(numberAsString);
		System.out.println(number1);
		double number2 = Double.parseDouble(numberAsString);
		
		numberAsString = numberAsString + 1;
		number1 	   = number1        + 1;
		number2		   = number2		+ 1;
		
		System.out.println("numberAsString: " + numberAsString + "  => Concatenated");
		System.out.println("number	      : " + number1 + "   => arithmetic operation");
		System.out.println("number2       : " + number2 + " => arithmetic operation");
		
		int int1 = 10;
		String str = String.valueOf(int1);
		System.out.println("int -> String : " + str);
		
		String str1 = Integer.toString(int1);
		System.out.println("int -> String : " + str1);
	}

}
