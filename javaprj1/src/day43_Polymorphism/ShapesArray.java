package day43_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {
	
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Square();		//polymorphism
		
		shapes[1] = new Triangle();		//polymorphism
		
		shapes[2] = new Circle();		//polymorphism
		

		for(Shape sh: shapes) {
//			sh.draw();					// without looking above code lines, do you know from which class this method running from?
			
			System.out.println(sh.getClass());
//			System.out.println(sh.getClass().getName());			//getName() gives with package name
			System.out.println(sh.getClass().getSimpleName());		//getSimpleName() gives with direct name
			sh.draw();
			
			}

//		ArrayList<Shape> shapeList = new ArrayList<>();
		List<Shape> shapeList = new ArrayList<Shape>();		//looking after colelction mapping, it is made as polymorphic
		
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		
		
	}

}
