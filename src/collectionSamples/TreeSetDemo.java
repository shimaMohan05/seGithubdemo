package collectionSamples;

import java.util.TreeSet;

public class TreeSetDemo {
	//duplicates not allowed
	//tree structure
	//sorting in ascending order
	

	public static void main(String[] args) {
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(23);
		tr.add(13);
		tr.add(45);
		tr.add(23);
		tr.add(67);
		//tr.add(null);null is not allowing in treeset
		tr.add(2);
		System.out.println(tr);
		

	}

}
