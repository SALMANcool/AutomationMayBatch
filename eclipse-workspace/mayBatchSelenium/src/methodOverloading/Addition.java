package methodOverloading;

public class Addition {
	
	
	public void  sum(int i,int j)
	{
		
	//	System.out.println("it is of integer" +i +j);
		int k=i+j;
		System.out.println("sum of two numbers are"+k);
		//return i+j;
		
	}

	public float sum(float i,float j)
	{
		System.out.println("it is of float"+i +j);
		
		return i+j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition add=new Addition();
	//	add.sum(10.00f, 20.00f);
		add.sum(10, 20);
		//System.out.println(add.sum(10, 20));
		
		

	}

}
