package day3_Variable_DataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		//INTEGER VRS
		
		byte b1=25;
		byte b2=-25;
		byte b3=127;
		
		System.out.println("b1= " + b1);
		System.out.println("b2= " + b2);
		System.out.println("b3= " + b3);
		
		System.out.println();
		
		short s1=-32768;
		short s2=32767;
		short s3=500;
		
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		System.out.println("s3= "+s3);
		
		System.out.println();
		
		int i1=-214768;
		int i2=20;
		int i3=100_000;
		int i4=100000;
		
		System.out.println("i1= "+i1);
		System.out.println("i2= "+i2);
		System.out.println("i3= "+i3);
		System.out.println("i4= "+i4);
		
		System.out.println();
		
		long l1=5000;         //suffix L(or l) is optional as number within range
		long l2=-2147483649L; //without L(or l) number is out of range
		long creditCrdNumber=5879_0987_3456_8764L;
		
		System.out.println("l1= "+l1);
		System.out.println("l1= "+l2);
		System.out.println("credit Card Number: "+creditCrdNumber);
		
		
		//FLOAT VRS (default is double)
		
		System.out.println();
		float f1=2.1f; //normally default is 'double' therefore when declaring float we have to specify 'f' at the end.
		double PI=3.14;
		
		System.out.println("f1= "+f1);
		System.out.println("PI= "+PI);
		
		System.out.println();
		
		//CHAR (check: https://unicode-table.com/en/#0041)
		
		char c1='A';
		char c2=65; 		//HTML-Code: 		&#65;
		char c3='\u0041';	//Unicode number:	U+0041
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		System.out.println();
		
		
		//BOOLEAN VRS
		
		boolean status=true;
		boolean status2=false;
		System.out.println("Eligibility for final exam: "+status);
		System.out.println("Kid is 16 - can he drive a car? "+status2);
		System.out.println();
		
		//STRING
		
		String name="SANZHARBEK";
		System.out.println("Student name: "+name);
		
	}

}
