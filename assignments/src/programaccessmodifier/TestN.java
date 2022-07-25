package programaccessmodifier;

public class TestN {
	protected long b=23;
	public int h=21;
	double s=57;
	public void methodPublic(){    
		methodPrivate();
	}

	protected void methodProtected(){   
		methodPrivate();
	}

	void methodDefault(){   
		methodPrivate();
	}

	private void methodPrivate(){     
		;
		System.out.println("Value of public value h"+ h);
		System.out.println("Value of double"+ s);
		System.out.println("Value of protected long"+ b);
		
	}

}
