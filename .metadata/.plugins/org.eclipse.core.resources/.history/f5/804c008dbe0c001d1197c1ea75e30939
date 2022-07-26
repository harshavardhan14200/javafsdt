package phase1java;

public class Studentprg {
	String name,n;
	int age,s1m=0,s2m,s3m,a;
	char section,s;
	char gender,g;
	float total;
	float percentage;
	
	Studentprg(String name,int age,int subject1m,int subject2m, int subject3m,char section,char gender){
		total=(subject1m+subject2m+subject3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
		
	}
	Studentprg(String name,int age,int subject2m, int subject3m,char section,char gender){
		 total=(s1m+subject2m+subject3m);
		 percentage=(total/300)*100;
		 n=name;
		 a= age;
		 s=section;
		 g=gender;
	}
void display(){
	System.out.println("student name is " +n +" age:"+a+" section:"+s+" gender:"+g+" total:"+total+" percentage:"+percentage);
	
}
	public static void main(String[] args) {
		Studentprg s1=new Studentprg("uday",28,88,66,70,'A','M');
		s1.display();
		Studentprg s2=new Studentprg("bhanu",23,72,69,'C','M');
		s2.display();
		Studentprg s3=new Studentprg("mounika",70,94,89,'D','F');
		s3.display();
		Studentprg s4=new Studentprg("swetha",62,56,76,85,'B','F');
		s4.display();
	}

}

