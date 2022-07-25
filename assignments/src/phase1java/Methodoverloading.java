package phase1java;

public class Methodoverloading {
	public void calculate1(int a,int b){
		System.out.println("add= "+(a+b));
	}
	public void calculate2(long w,long l){
		System.out.println("area of rectangle : "+w*l);
	}
	public void calculate3(int h)
	{
		System.out.println("area of square :"+h*h);
	}
	public void calculate4(long r)
	{
		System.out.println("area of circle :"+3.14*r*r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ob=new Methodoverloading();
		ob.calculate1(2,5);
		ob.calculate2(10,5);
		ob.calculate3(2);
		ob.calculate4(8);
	}

}


