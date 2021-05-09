package day30_WrapperClass;

import java.util.Arrays;

public class task96_DegreeToCelcius {
	
	public static void main(String[] args) {
		
		String str = "Today weather is sunny and 105.3 degree. It is a perfect day to practice a Java.";
		String[] array = str.split("and ");
		System.out.println(Arrays.toString(array));
		         array = array[1].split(" degree");
        System.out.println(Arrays.toString(array));
        
        String degree = array[0];
        
        double degreeF = Double.parseDouble(degree);
        double degreeC = (degreeF - 32) * 5/9;
        
        System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius.");
		
		
	}

}
/*
String str = "Today weather is sunny and 72 degree. It is a perfect day to practice a Java."
•Write a program to output: 72 degree is equal to 22.22 celcius
*/