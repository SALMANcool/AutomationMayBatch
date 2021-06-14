package wrapperClassCocepts;


public class WrapperClassesConcepts {
	
	
	public void autoBoxing()
	{
		int i=10;//primitve datatype
		System.out.println( "primitive datatype is"+i);
		Integer intObj = Integer.valueOf(i);
		System.out.println("after conversion of primitive datype to object"+intObj);
	}
	
	public void unboxing()
	{
		
		Integer integ=new Integer(5);
		int j = integ.intValue();
		System.out.println("converting object to primitive data type"+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClassesConcepts wrcc=new WrapperClassesConcepts();
	//	wrcc.autoBoxing();
		wrcc.unboxing();
	}

}
