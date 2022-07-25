package programaccessmodifier;

public class TestM {
	
	    private int y= 10;  
		long k = 1000;   
		protected float f= 56.36f;
	  public void methodPublic(){     
		  methodPrivate();
	}

	protected void methodProtected(){   // protected method
		methodPrivate();
	}

	void methodDefault(){    //default method
		methodPrivate();
	}

	private void methodPrivate(){     // private method
		
		System.out.println("Value of private value y"+ y);
		System.out.println("Value of long"+ k);
		System.out.println("Value of protected float"+ f);
		
	}
	}

