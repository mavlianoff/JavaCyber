package day26_Arrays_part3;

import java.util.Arrays;

public class task94_SearchResult {
	
	public static void main(String[] args) {
		
		/*
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		Create a password based on given info.
		Output: CD132G00ABC!
		 */
		
		String str1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String str2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] str1Array = str1.split("password :");
		String[] str2Array = str2.split("password :");
		System.out.println(Arrays.toString(str1Array));
		System.out.println(Arrays.toString(str2Array));
		
//		String[] pass1Array = str1Array[1].split(". Please");
//		String pass1 = pass1Array[1].split(". Please")[0];
		String pass1 = str1Array[1].split(". Please")[0].trim();
		String pass2 = str2Array[1].split(". Please")[0].trim();
		System.out.println(pass1);
		System.out.println(pass2);
		
		System.out.println("Output: " + pass1.substring(3,9).concat(pass2.substring(3,9)));
		
	}

}
