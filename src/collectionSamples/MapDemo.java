package collectionSamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// HashMap is the class which implements Map Interface
		//which is also follow HashTable data structure
		//maintains key ,value pair
		HashMap<Integer,String>hm=new HashMap<Integer, String>();
		hm.put(101, "shima");
		hm.put(102, "vinay");
		hm.put(105, "sreeram");
		hm.put(107, "naomika");
		hm.put(103, "meenu");
		hm.put(104, "shinu");
		hm.put(104, "shiju");//key value must be unique,but here it is repeating so first value should be replaced by second value
		hm.put(108, "shima");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.get(105));
		for(Entry<Integer,String> e :hm.entrySet())
			System.out.println(e);
		System.out.println("******************************");
		Set<Entry<Integer, String>> hs=hm.entrySet();
		Iterator<Entry<Integer, String>> ir = hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}
