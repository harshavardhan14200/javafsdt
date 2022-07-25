package programaccessmodifier.child;


import programaccessmodifier.TestM;
import programaccessmodifier.TestN;

public class TestZ extends TestM{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestM().methodPublic();
		
		//TestB  b = new TestB();
		//b.methodProtected(); // compile time error

		// works, accessing super class protected method using subclass
		new TestZ().methodProtected();
		new TestZ().methodPublic();

	}


	}
