package throwsAndThrowConcepts;

import java.io.IOException;

public class ThrowsAndThrowImplementation {
	
	void m1() throws IOException,ArrayIndexOutOfBoundsException
	{
		System.out.println("i am from throws keyword");
		throw  new ArithmeticException("Devices error");
		
	}
	
	void m2()
	{
		System.out.println("exception handled");
	}

	void m3()
	{
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception handled"+e.getMessage());
		}
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
		// TODO Auto-generated method stub
		ThrowsAndThrowImplementation throwsandthrow=new ThrowsAndThrowImplementation();
		//throwsandthrow.m1();
		//throwsandthrow.m2();
		throwsandthrow.m3();
	}

}
