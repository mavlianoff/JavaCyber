package day22_stringManipulation_Lab;

public class StringStartsEndsWith {

	public static void main(String[] args) {

		String word1 = "eclipse";
		System.out.println(word1.startsWith("e"));   //true
		System.out.println(word1.startsWith("ec"));  //true
		System.out.println(word1.startsWith("ex"));  //false
		
		System.out.println(word1.endsWith("e"));	//true
		System.out.println(word1.endsWith("ipse"));	//true
		System.out.println(word1.endsWith("xe"));	//false
		
		//Mr. vs Mrs. vs Ms. vs Dr. vs No title
		String name = "Dr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("Married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("Single woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unknown title");
		}

	}

}
