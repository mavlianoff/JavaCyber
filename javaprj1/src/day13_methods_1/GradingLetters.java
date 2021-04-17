package day13_methods_1;

public class GradingLetters {

	public static void main(String[] args) {
		/*
		
		Write a method that accepts 3 grades and prints the grade according to the below table
		Sample Output:
		calculateGrade(100,100,100) - > A
		calculateGrade(50,50,50) - >F
		
		 */
		
		calculateGrade(60);

	}
	
	public static void calculateGrade(int i1) {
		if(i1>90 && i1<100) {
			System.out.println("A");
		}else if(i1>=80 && i1<90) {
			System.out.println("B");
		}else if(i1>=70 && i1<80) {
			System.out.println("C");
		}else if(i1>=60 && i1<70) {
			System.out.println("D");
		}else if(i1<60) {
			System.out.println("F");
		}else {
			System.out.println("Not valid");
		}
	}

}
