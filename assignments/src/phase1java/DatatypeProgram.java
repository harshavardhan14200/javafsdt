package phase1java;

public class DatatypeProgram {
	public static void main(String[] args) {
		int height= 56;
		float f= 56.36f;
		boolean status = true;
		char gender= 'M';
		long dist= 545498461315L;
		double d = 4554.548;
		

		
		System.out.println("This is my Datatype");
		System.out.println("float value is : " + f);
		System.out.println("integer age value is:" + height);
		System.out.println("status is:" + status);
		System.out.println("gender is:" + gender);
		System.out.println("distance is:" + dist);
		System.out.println("double value is:" + d);
		
	
		double d1= 64.67897;
		long l1= (long)d1;
		int b= (int)l1;
		char c= (char)b;
		System.out.println("long l1 value is:" + l1);
		System.out.println("int a value is:" + b);
		System.out.println("char c value is:" + c);
		
		long l2= 98798675L;
		byte b1= (byte)l2;
		System.out.println("byte b1 value is:" + b1);
		
		int i = 465;
		double d2= (double)i;
		long l3= (long)d2;
		System.out.println("long l3 value is:" + l3);
		
	}

}

