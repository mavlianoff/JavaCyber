package day22_stringManipulation_Lab;

public class Lab3_Q2_makeAbba {

	public static void main(String[] args) {
		
		/*
		Create a method that accepts two strings, a and b, return the result of putting them together in the order abba, 
		e.g. "Hi" and "Bye" returns "HiByeByeHi".
			makeAbba("Hi", "Bye") → "HiByeByeHi"
			makeAbba("Yo", "Alice") → "YoAliceAliceYo"
			makeAbba("What", "Up") → "WhatUpUpWhat"
		 */
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));

	}
	
	public static String makeAbba(String a, String b) {
		return a + b + b + a;
//		return a.concat(b).concat(b).concat(a);
	}

}
