package programaccessmodifier.child;
import programaccessmodifier.TestM;
import programaccessmodifier.TestN;

public class TestY extends TestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestN().methodPublic();
		new TestY().methodProtected();
		new TestY().methodPublic();
		new TestX().methodPublic();
		new TestX().methodProtected();
		new TestX().methodDefault(); 
		System.out.println("Value of long"+ new TestX().u);	
		System.out.println("Value of float"+ new TestX().f);	
		System.out.println("Value of char"+ new TestX().j);

	}

}
