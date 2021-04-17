package day20_stringManipulation_2;

public class StringReplace2 {

	public static void main(String[] args) {

		String sentence="Coding is fun, it is my hobby!!";
		String withNoSpace=sentence.replace(" ", "");
		System.out.println(withNoSpace);
		
		String  mixed="@#$%^&*()_)(&j$a-v|a";
		System.out.println(mixed);
		mixed=mixed.replace("@#$%", "first4CharReplacedWith");
		System.out.println(mixed);
		mixed=mixed.replace("first4CharReplacedWith", "");
		System.out.println(mixed);
		
		mixed=mixed.replace("^", "").replace("&", "").replace("*", "").replace("(", "").replace(")", "").
				replace("_", "").replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		
		String result="About 8,930,000,000 results (0.68 seconds)";
		result=result.replace("About ", "").replace(" results (0.68 seconds)", "");
//		result=result.replace("About", "").replace("results", "").replace("(0.68 seconds)", "").replace(" ", "");
		System.out.println(result);
				
				

	}

}
