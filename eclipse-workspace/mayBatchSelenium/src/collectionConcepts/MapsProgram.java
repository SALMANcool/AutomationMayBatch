package collectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsProgram {
	
	public void hashMapsProgram()
	{
		HashMap<String, String> hm=new HashMap<String,String>();
		hm.put("FirstRecord", "salman");
		hm.put("SecondRecord", "kishore");
		hm.put("ThirdRecord", "praveen");
		//System.out.println(hm.entrySet());

		System.out.println(hm.keySet());
		System.out.println(hm.containsKey("First"));
		System.out.println(hm.containsValue("salman"));
		System.out.println(hm.values());	
	}
	
	public void linkedHashMapsProgram()
	{
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String,String>();
		//lhm.put(null, null);
		lhm.put(null, "salman");
		System.out.println();
		lhm.put("SecondRecord", "sathish");
		lhm.put("ThirdRecord", "praveen");
		
		System.out.println(lhm.get("SecondRecord"));

//		System.out.println(lhm.keySet());
//		System.out.println(lhm.containsKey("First"));
//		System.out.println(lhm.containsValue("salman"));
//		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());
		
//		for(Set<Entry<String, String>> iterable_element = lhm.entrySet()) 
//		{
//			
//			System.out.println(lhm.containsValue(iterable_element.get));
//		}
	}
	
	public void treeMapProgram()
	{
		TreeMap<String, String> treemap=new TreeMap<String,String>();
		//lhm.put(null, null);
		treemap.put("FirstRecord", "salman");
	//System.out.println();
		treemap.put("SecondRecord", "kishore");
		treemap.put("ThirdRecord", "praveen");
		treemap.put("FourthRecord", "gowthami");
		treemap.put("FourthRecord", "gowthami");
		//System.out.println(hm.entrySet());

//		System.out.println(treemap.keySet());
//		System.out.println(treemap.containsKey("First"));
//		System.out.println(treemap.containsValue("salman"));
//		System.out.println(treemap.values());
		System.out.println(treemap.entrySet());
		System.out.println(treemap.descendingMap());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapsProgram mp=new MapsProgram();
		//mp.hashMapsProgram();
		mp.linkedHashMapsProgram();
		//mp.treeMapProgram();
	}

}
