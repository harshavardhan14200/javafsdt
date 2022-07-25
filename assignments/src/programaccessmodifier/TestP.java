package programaccessmodifier;

public class TestP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestM().methodPublic();
		new TestM().methodProtected();
		new TestM().methodDefault(); 
		System.out.println("Value of long"+ new TestM().k);	
		System.out.println("Value of float"+ new TestM().f);	
		new TestN().methodPublic();
		new TestN().methodProtected();
		new TestN().methodDefault(); 
		System.out.println("Value of long"+ new TestN().b);	
		System.out.println("Value of int"+ new TestN().h);	
		System.out.println("Value of double"+ new TestN().s);	
	}
}
