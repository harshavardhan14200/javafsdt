package programaccessmodifier.child;

public class TestX {
	private int g= 10;   //private variable
	long u = 1000;   
	protected float f= 56.36f;
	public char j= 'M';
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
		System.out.println("Value of private value g"+ g);
		System.out.println("Value of long"+ u);
		System.out.println("Value of protected float"+ f);
		System.out.println("Value of char"+ j);
		
	}
	}
 


