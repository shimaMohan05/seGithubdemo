package collectionSamples;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// doubly linked hash table
		//douplicates not allowed
		//in order
LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
lh.add(13);
lh.add(45);
lh.add(67);
lh.add(21);
lh.add(67);
lh.add(33);
lh.add(73);
System.out.println(lh);
 


	}

}
