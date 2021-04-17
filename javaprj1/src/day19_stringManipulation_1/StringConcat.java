package day19_stringManipulation_1;

public class StringConcat {

	public static void main(String[] args) {

		String word="Java";
		
		System.out.println(word.concat(" + Selenium"));
		
		System.out.println(word); //NOTE: we just did concatenate, NOT ASSIGN/MODIFY original string
		
//		System.out.println(word.concat(123)); // will not work as concat(String str) method accepts String only
		System.out.println(word.concat("123"));
		
		word=word+true;
		System.out.println(word); //Javatrue
		
		
		String word2="Hi!";
		word2=word2.concat(" -Hey!").concat(" - How are you?").concat(" - I am fine, thanks!");
		System.out.println(word2);
		

	}

}
