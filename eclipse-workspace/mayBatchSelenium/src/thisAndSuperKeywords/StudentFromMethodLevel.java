package thisAndSuperKeywords;

public class StudentFromMethodLevel {
	
	void m1()
	{
		System.out.println("I am from m1 method");
	}
	void m2()
	{
		this.m1();
		System.out.println("i am from m2");
	}
	void m3()
	{
		
	}
	
	 public static void main(String[] args) {
		 StudentFromMethodLevel methidlevel=new StudentFromMethodLevel();
		 methidlevel.m2();
		 
		
	}

}
