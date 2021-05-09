package day30_WrapperClass;

public class task98_decodeTheCode {
	
	public static void main(String[] args) {
		
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo# &%^f!@#$%$#$%^%$$%i45645756768ve$% $S#$%^..,,!i#@$^**&^x@!$";
		String str2 = "N000000000000i@#$%n9@#$e!!!!!! 43.***T#@$hr@#$%##<e><e>>>>{{ ##f##00o00###u%$@##$%#r";
		
		System.out.println(decodingCode(str1, str2));
		
	}
	//INCOMPLETE:
	public static String decodingCode(String strx, String stry) {
		String newStrx = "";
		String newStry = "";
		
		for(int i=0; i<strx.length(); i++) {
			if(Character.isAlphabetic(strx.charAt(i)) || strx.charAt(i)==' ') {
				newStrx = newStrx + strx.charAt(i);
			}
		}
			
		for(int i=0; i<stry.length(); i++) {
			if(Character.isAlphabetic(stry.charAt(i)) || stry.charAt(i)==' ') {
				newStry = newStry + stry.charAt(i);
			}
		}
		
		return newStrx;
		//return newStry;
		
	}
}
/*
String str1 = "";
String str2 = "";
Change the implementation of decodeTheCode(String) method such that on executing class, following output is shown: 
1 2 5 6
9 3 4
 */
