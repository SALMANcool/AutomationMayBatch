package mayBatchCoreJavaPractice;

public class CreationOfClassAndObjects {
	
	
	public static int z=100;
	public  int i=10;
	private int j=20;
	protected int k=25;
	
	public void m1()
	{
		String s1="salman";
		
		System.out.println("the  name is"  +s1);
	}

	public int  m2()
	{
		int sum=i+j;
		System.out.println("sum of i+j is" + sum);
		return sum;
	}
	
//	public static void m3()
//	{
//		System.out.println("without creation of object" +z);
//	}
	
	public int  m4()
	{
		int summ4=m2();
		return summ4;
		
	}
	public static void main(String[] args) {
		//creation of object
		//<class name> object name=new <className>();
		CreationOfClassAndObjects  classandobjects=new CreationOfClassAndObjects();
//		classandobjects.m1();
//		classandobjects.m2();
		classandobjects.m4();
	//System.out.println("without creation of object" +z);
	//	CreationOfClassAndObjects.m3();
		// TODO Auto-generated method stub

	}

}
