package day30_WrapperClass;

public class varArgs {
	
	public static void main(String[] args) {
		
		sum(2,4);
		sum(20,43, 65, 99);
		sum(2,7, 19);
		
		concat("Apple", "123", "true", "ABC");
		
	}
	
	public static void sum(int...numbers) { // 'int... numbers' called varArgs which accepts elements and converts them to array
		int sum=0;
		for(int each: numbers) {
			sum=sum+each;
		}
		System.out.println(sum);
	}
	
	public static void concat(String...strs) {
		String newStr="";
		for(String each: strs) {
			newStr = newStr + each.charAt(2);
		}
		System.out.println(newStr);
	}

}
