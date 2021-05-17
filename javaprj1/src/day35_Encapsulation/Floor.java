package day35_Encapsulation;

public class Floor {
	
	//instance variable = fields
	double length, width;

	public Floor(double length, double width) {
		
		if(length<0) {
			this.length = 0;
		}else {
			this.length = length;
		}
		
		if(width<0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		

	}
	
	public double getArea() {
		return width * length;
	}
	
	
	
	
	
}
