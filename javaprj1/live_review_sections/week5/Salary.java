package week5;

public class Salary {
	
	public double rate;
	public int weeklyHour;
	public double taxRate;
	
	public void setInfo(double hourlyRate, int numberOfHours, double tax) {
		
		rate = hourlyRate;
		weeklyHour = numberOfHours;
		taxRate = tax;
	}
	
	public double salary() {
		return rate * weeklyHour * 53; //annual salary
	}
	
	public double totalTax() {
		return salary() * taxRate;
	}
	
	public double salaryAfterTax() {
		return salary() - totalTax();
	}

	public String toString() {
		return "Salary [rate=" + rate 
				+ ", weeklyHour=" + weeklyHour 
				+ ", taxRate=" + taxRate 
				+ ", salary=$" + salary() 
				+ ", totalTax=$" + totalTax() 
				+ ", salaryAfterTax=$" + salaryAfterTax() +"]";
	}
	
	

}
