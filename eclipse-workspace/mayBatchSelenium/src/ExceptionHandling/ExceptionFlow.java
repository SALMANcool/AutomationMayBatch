package ExceptionHandling;

public class ExceptionFlow {
	
	 int i=10;
	 int k=0;
	// int div=i/k;
	
	 public void subraction()  //statement1
	 {
		 int sub=i-k;
		 System.out.println("subraction"+sub);
	 } 
	 
//	 public  void withoutHandlingExceptionMethod()//statement 2
//	 {
//		 int div=i/k;
//		 
//		 System.out.println("before exception handle");
//		 System.out.println("division"+div);
//	 }
	public void handlingExceptionMethod()// statement 3--exceptional handling
	{
	try
	{
	 String s=null;//null poiner exception
	 System.out.println(s.length());
	}
	catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		
		System.out.println("output  will be null");
	}
	
	try
	{
		int a[]=new int[5];
		a[5]=30/0;//Arithmetic exception
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());	
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("finall block will be executed");
	}
}

	public void sum() //statement 4
	{
	
		int sum=i+k;
		System.out.println("Addition "+sum);
	}
	
	
	public static void main(String[] args) {
		
	//	System.out.println(div);
		ExceptionFlow ef=new ExceptionFlow();
		ef.subraction();
		//ef.withoutHandlingExceptionMethod();
		ef.handlingExceptionMethod();
		ef.sum();
	}

}
