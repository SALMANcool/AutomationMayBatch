package practice1;

public class StaticKeywords {
	
//	public static int i=10;
	
	//Adress is fixed
	
	final int i=10;

	
	public static void m1()
	{
		System.out.println("I am from static method");
	}
	
public static void main(String[] args) {
	StaticKeywords.m1();
}
}
