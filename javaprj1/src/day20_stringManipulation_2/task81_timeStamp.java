package day20_stringManipulation_2;

public class task81_timeStamp {
	
	public static void main(String[] args){
	
		/*
		Write a method that accept the date with time and creates a timeStampfor your automation report.
		 */
		
		String date="10/10/2019 14:59:00";
//		timeStamp(date);
		System.out.println(timeStamp(date));
	}
	
	public static String timeStamp(String date) {
		date=date.replace("/", "").replace(" ", "").replace(":", "");
		return date;
		
	}
	
	

}
