package practice1;

public class AccessModifiers {
	
	public void m1()
	{
		System.out.println("I am public access specifier from practice1 package");
	}
	protected void m2()
	{
		System.out.println("I am protected access specifier from practice1 package");
	}

	 void m3()
	{
		 System.out.println("I am from default access specifier from practice1 package");	
	}
	 
	 private void m4()
	 {
		 System.out.println("I am from private  access specifier from practice1 package");
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am4=new AccessModifiers();
		am4.m4();
		am4.m1();
		am4.m2();
		am4.m3();
	}

}
