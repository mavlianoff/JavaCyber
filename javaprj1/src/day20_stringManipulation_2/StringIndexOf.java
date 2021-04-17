package day20_stringManipulation_2;

public class StringIndexOf {

	public static void main(String[] args) {
		
		String word="github";
		System.out.println(word.indexOf("h"));
		System.out.println(word.indexOf("hub"));
		System.out.println(word.indexOf("java"));
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Position of .(dot) is: " + i);
		System.out.println(url.charAt(i+1));
		
		
		//find position of '-' and check if space is on the right and left side;
		String title = "Java - Google Search";
		int i1 = title.indexOf("-");
		System.out.println("Position of -(hyphen) is: " + i1);
		if(title.charAt(i1-1) == title.charAt(i1+1)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		String country="United States of America";
		System.out.println(country.indexOf("States")); // 7
//		System.out.println(country.indexOf("states")); // -1
		
		String word2="java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		System.out.println(word2.contains("c++"));
		System.out.println(word2.indexOf("c++"));
		
		if(word2.indexOf("c++")>-1) {
			System.out.println("c++");
		}else {
			System.out.println("NA");
		}
		
		
		
	}

}
