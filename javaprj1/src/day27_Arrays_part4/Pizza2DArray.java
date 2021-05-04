package day27_Arrays_part4;

import java.util.Arrays;

public class Pizza2DArray {
	
	public static void main(String[] args) {
		
		String[][] pizzas = {
				
				{"pineapple", "pepperoni"},
				{"anchovies", "mushroom", "olives"},
				{"4 cheese"},
				{"chicken", "tomatoes", "onions"},
				{"green peppers", "zuccini", "brocoli", "spinach", "shrimp"}
		};
		
		System.out.println("==== MANUAL PRINT ====");
		System.out.println(Arrays.toString(pizzas[0]));
		System.out.println(Arrays.toString(pizzas[1]));
		System.out.println(Arrays.toString(pizzas[2]));
		System.out.println(Arrays.toString(pizzas[3]));
		System.out.println(Arrays.toString(pizzas[4]));
		System.out.println("===== LOOP PRINT =====");
		for(int i = 0; i< pizzas.length; i++) {
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println("=======================");
		for(String[] each2D: pizzas) {
			for(String each: each2D) {
				System.out.print(each + " ");
			}
		}
		
		System.out.println("\n======================");
		for(int i = 0; i < pizzas.length; i++) {
			for(int j = 0; j < pizzas[i].length; j++) {
				System.out.print(pizzas[i][j] + " ");
			}
		}
		
		System.out.println("\n======================");
		for(String each: pizzas[3]) {
			System.out.print(each + " ");
		}
		
	}

}
