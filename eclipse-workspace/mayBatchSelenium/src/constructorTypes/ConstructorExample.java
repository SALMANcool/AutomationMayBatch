package constructorTypes;

public class ConstructorExample {
	
	//default constructor
	public ConstructorExample()
	{
		System.out.println("default constructor");
	}
	
//parameterized constructor
	public ConstructorExample(int a,String name)
	{
		System.out.println("parameterized  constructor");
		System.out.println("amazon portal url");
	System.out.println("value of a is"+a);
	System.out.println("name is"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor object creation
		ConstructorExample constdefault=new ConstructorExample();
		
		//parameterized constructor object creation
		ConstructorExample consteparameterized=new ConstructorExample(10,"salman");
		
	}

}
