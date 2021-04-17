package day20_stringManipulation_2;

public class StringReplace {

	public static void main(String[] args) {

		String str="Moscow is the capital city of Russia of Russia";
		str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email="firstName_LastName@gmail.com";
		String company="CapitalOne";
		String newEmail=email.replace("gmail", company);
		System.out.println(newEmail);
		System.out.println(email);
		

	}

}
