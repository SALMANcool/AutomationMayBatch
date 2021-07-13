package practice2;

import practice1.AccessModifiers;

public class AcessModifiers2 extends AccessModifiers  {
	int i=10;
	public void m5()
	{
		System.out.println("I am public access specifier from practice2 package");
	}
	public int m10()
	{
		System.out.println("I am public access specifier from practice2 package");
		return 15;
	}
	protected String m6()
	{
		System.out.println("I am protected access specifier from practice2 package");
		int sum=m10();
		String s="salman";
		System.out.println(sum);
		return s;
	}

	 void m7()
	{
		 System.out.println("I am from default access specifier from practice2 package");	
	}
	 
	 private void m8()
	 {
		 System.out.println("I am from provate  access specifier from practice2 package");
	 }
	

	public static void main(String[] args) {
		AcessModifiers2 am2=new AcessModifiers2();
		//AccessModifiers am1=new AccessModifiers();
		//public access specifiers
	//am2.m5();	
	//am2.m1();
		//protected access specifiers
		am2.m2();
		
	//	am2.m6();
	//	new will create memory space for the respective methods
		// TODO Auto-generated method stub

	}

}
