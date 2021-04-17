package day6_logicalOperators;

public class Tasks_logicalOperators {

	public static void main(String[] args) {
		
		System.out.println("***************************************************");
		
		int ApplesCount=20;
		int OrangesCount=30;
		int PearsCount=30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount; // T || --- = T 
		System.out.println(comp);
		
		
		System.out.println("***************************************************");
		
		
		
		String OutsideWeather = "Shinny";
		int Degree = 70;
		
		boolean comp2=(!(OutsideWeather=="Rainy" || Degree ==70)); // !(F||T) = !T = F
		System.out.println(comp2);
		
		
		System.out.println("***************************************************");
		
		int b=2;
		
		boolean res = ++b ==2 || --b == 2 && --b ==2; // 3 == 3 || 2 == 2 && 1 == 2  => F || T && F => T && F = F 
		System.out.println(res);
		
		
		System.out.println("***************************************************");
		
		boolean x =true, z = true;
		int y=20;
		x = (y != 10) || (z = false); // T || F = T
		System.out.println(x);
		
		
		System.out.println("***************************************************");
		
		double d1=20;
		double d2=80;
		
		double result=(d1+d2)*25;
		double remainder=result%40;
		
		System.out.println(result<=20);
		
		System.out.println("***************************************************");

	}

}

