package phase1java;

public class AreaOfRectangle {
	
		int area(int w,int h)
		 {	
			int c= w*h; 
			return c;
		 }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				
				AreaOfRectangle a = new AreaOfRectangle();
				int Area = a.area(2,20);
				System.out.println("area of rect:"+Area);

			

		}

	}