package assignments.ArithmeticOperators;

public class question6 {

	public static void main(String[] args) {
		/*
		
		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

		Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

       	Sample Output

      	Number of milligrams in drink: 500
      	It would take about 20 drinks for a lethal overdose
		
		 */

//	    SOLUTION-1
		int grams = 10;
		int milligramConverter = 1000*grams;
		int milligramsCaffeine=milligramConverter;
//		int cup1 = 200;     // assuming one cup is 200 grams
		int NormalDoze = 200/10;
		
		int milligramsInDrink = (milligramsCaffeine/NormalDoze);		
		
	   
	    int numberOfDrinks = milligramsCaffeine/milligramsInDrink;
	    
	    System.out.println("Number of milligrams in drink: " + milligramsInDrink);
	    System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose");
	    
	    
	    
//	    SOLUTION-2
	    int overDose = 10000;
		int cup2 = 200;
		int numOfDrink = 0;
		int normalDose = cup2/10; // 10 grams in drink
		int mgInDrink = overDose/normalDose;
		
		System.out.println("Number of milligrams in drink: " + mgInDrink);
		
		while (numOfDrink*cup2 < overDose) {
			numOfDrink++;		
		}
		System.out.println("It would take about " + numOfDrink + " drinks for lethal overdose");

	}

}
