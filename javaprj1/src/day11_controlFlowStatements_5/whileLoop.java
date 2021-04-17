package day11_controlFlowStatements_5;

public class whileLoop {

	public static void main(String[] args) {
		
		System.out.println("************************************");
		
		//print 0-10
		
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;	
		}
		

		System.out.println("************************************");
		
		int numberOfStudents=1;
		while(numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
			
		}
		System.out.println("************************************");
		
		//print 11-1
		int num=11;
		while(num>=1) {
			System.out.println(num + " ");
			num--;
		}
		
		System.out.println("************************************");
		
		
	}

}
