package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class HashSetOfProducts {
	
	public static void main(String[] args) {
		
		//create set collection and add new products
		
		Set<Product> prodSet = new HashSet<>();
		
		prodSet.add(new Product("book", 25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("magazine", 7.99));
		
		
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		
		for(Product each: prodSet) {
			System.out.println(each);
//			System.out.println(each.getPrice());  		//to print only prices
		}
		
		//print each product using forEach method
		//side note: if emthod to be called, it requires object (prodSet)
		
		prodSet.forEach(each -> System.out.println(each));
		prodSet.forEach(each -> System.out.println(each.getName()));
		
		
	}

}
