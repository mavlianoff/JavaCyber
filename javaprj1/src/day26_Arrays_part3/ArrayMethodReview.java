package day26_Arrays_part3;

public class ArrayMethodReview {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40};
		
		showArray(numbers);
		
	}
	
	public static void showArray(int[] myArray) {
		for(int values: myArray) {
			System.out.println(values);
		}
		
	}

}
