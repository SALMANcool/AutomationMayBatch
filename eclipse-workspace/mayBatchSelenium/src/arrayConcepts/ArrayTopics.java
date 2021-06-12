package arrayConcepts;

import java.util.Iterator;

public class ArrayTopics {
	
	public void singleDimensionalArray()
	{
//		int a[]= {10,20,30};
//		System.out.println( "i am a[0]  "   +a[0]);
//		
		
		
		int constantsize[]=new int[3];
		constantsize[0]=100;
		constantsize[1]=200;
		constantsize[2]=300;
		for (int i = 0; i < constantsize.length; i++) {
			System.out.println(constantsize[i]);
		}
	}
	
	public void multiDimensionalArray()
	{
		int multiDimensional[][]=new int[2][2];//2*2 matrix
		
		
		               //row//coloumns
		multiDimensional[0][0]=100;
		multiDimensional[0][1]=200;
		multiDimensional[1][0]=300;
		multiDimensional[1][1]=400;
		
		for (int i = 0; i < multiDimensional.length; i++)
		{
			for (int j = 0; j < multiDimensional.length; j++) {
				System.out.println("multi dimensional array"+multiDimensional[i][j]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTopics at=new ArrayTopics();
		//at.singleDimensionalArray();
		at.multiDimensionalArray();
	}

}
