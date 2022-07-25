package phase1java;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Started Java "); 
		
		sb.append("Phase1");        //now original string is changed  
		System.out.println(sb);
		
		sb.delete(2,5);  
		System.out.println(sb);//prints Hello Java  
		
		sb.replace(4,9," python");  
		System.out.println(sb);
		
		sb.insert(11," language");     //now original string is changed  
		System.out.println(sb);  
		
		sb.reverse();  
		System.out.println(sb);
		
		System.out.println(sb.charAt(9));

	}



	}

