package day15_methods_3;

public class task69_primeNumber {

	public static void main(String[] args) {
		/*
		A prime number is a number that is evenly divisible only by itself and 1. For example,
		the number 5 is prime number because it can be evenly divided only by 1 and 5. The
		number 6, however, is not prime number because it can be divided evenly by 1,2,3,and
		6.
		Write a method named isPrime which takes an integer as an argument and returns true if
		the argument is a prime number, or false otherwise.
		• Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all
		the other even numbers can be divided by 2.
		 */
		
		boolean isTrue=isPrime(6);
		System.out.println(isTrue);
		System.out.println(isPrime(5));
		
		int number=7;
		if(isPrime(number)) {
			System.out.println(number + ": Prime number");
		}else {
			System.out.println(number + ": NOT Prime number");
		}
		

	}
	
	public static boolean isPrime(int number) {
		
		boolean flag=true;
		
		if(number==0 || number==1) {
			flag=false;
			
		}else {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					flag=false;
					break;
				}
			}
		}
		return flag;
	}

}
