package day25_Arrays_part2;

public class SamaArray {

	public static void main(String[] args) {
		
		int[] array1 = {2,4,6,8,10};
		int[] array2 = array1;
		
		array1[0] = 20;
		array2[4] = 100;
		
		System.out.println("Contents of array1:");
		for(int value: array1) {
			System.out.println(value);
		}
		
		System.out.println("Contents of array2:");
		for(int value: array2) {
			System.out.println(value);
		}
		
	}

}
