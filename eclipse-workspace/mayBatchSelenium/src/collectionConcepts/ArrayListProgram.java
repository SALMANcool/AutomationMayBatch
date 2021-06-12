package collectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListProgram {
	
	public void arrayListcode()
	{
		ArrayList al =new ArrayList();
		al.add("Salman");//string
		al.add("kishore");
		al.add("praveen");
		al.add("Salman");
		al.add(10); //integer
		al.add(10.00f);
		System.out.println( "array list values are"+al);
		
		//iterator-Traversing the elements
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
		
			System.out.println(itr.next());
		}	
	}
	
	public void iteratingWithForEachLoop()
	{
		ArrayList<String> al =new ArrayList<String>();
		al.add("Salman");//string
		al.add("kishore");
		al.add("praveen");
		al.add("Salman");
		for (String str : al) 
		{
			System.out.println(str);
		}
	}	
		public void linkedListProgram()
		{
			LinkedList<String> al =new LinkedList<String>();
			al.add("Salman");//string
			al.add("kishore");
			al.add("praveen");
			al.add("Salman");
			for (String str : al) 
			{
				System.out.println(str);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListProgram alp=new ArrayListProgram();
		//alp.arrayListcode();
		//alp.iteratingWithForEachLoop();
		alp.linkedListProgram();
	}

}
