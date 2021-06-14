package collectionConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPrograms {
	
	public void hashSetPrograms()
	{
		HashSet<String> hs =new HashSet<String>();
		hs.add("Salman");
		hs.add("kishore");
		hs.add("praveen");
		hs.add("vijay");
		hs.add("gowthami");
		hs.add("kishore");
		System.out.println(hs);
	}

	
	public void linkedHashSetPrograms()
	{
		LinkedHashSet<String> hs =new LinkedHashSet<String>();
		hs.add("Salman");
		hs.add("kishore");
		hs.add("praveen");
		hs.add("vijay");
		hs.add("gowthami");
		hs.add("kishore");
		System.out.println(hs);
	}
	
	public void TreeSetPrograms()
	{
		TreeSet<String> ts =new TreeSet<String>();
		ts.add("salman");
		ts.add("kishore");
		ts.add("praveen");
		ts.add("vijay");
		ts.add("gowthami");
		//hs.add("kishore");
		System.out.println(ts);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetPrograms hsp=new SetPrograms();
		//hsp.hashSetPrograms();
		//hsp.linkedHashSetPrograms();
		hsp.TreeSetPrograms();

	}

}
