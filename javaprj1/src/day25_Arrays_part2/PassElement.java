package day25_Arrays_II;

public class PassElement {

	public static void main(String[] args) {

		int[] numbers = {5,10, 15, 20, 50, 30};
		for(int value: numbers) {
			showValue(value);
		}
		
	}
	
	public static void showValue(int n) {
		System.out.print(n + " ");
	}
	

}
