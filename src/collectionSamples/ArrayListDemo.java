package collectionSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {
//Duplicates allowed
	//DynamicArray structure
	//ordered iteration means Index based
	//data retrieval
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(12);
		ar.add(null);
		ar.add(23);
		ar.add(34);
		ar.add(24);
		ar.add(23);
		
		
		System.out.println(("length of arrayliat"+ar.size()));
		System.out.println("5th element in ayyaylist"+ar.get(4));
		System.out.println("Is Array list empty"+ar.isEmpty());
		System.out.println("Is Arraylist contain 20"+ar.contains(20));
        System.out.println("*****Iteration using for loop******");
	
	
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i));
	}
	System.out.println("******Iteration using for each**********");
	for(Integer i:ar)
	{
		System.out.println(i);
	}
	
	Iterator<Integer> ir=ar.iterator();
	System.out.println("*********Iteration using iterato()***********");
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}
	
	 // sorting by Collections.sort method
	try
	{
	 Collections.sort(ar);
	 System.out.println("sorted list is:" +ar);
	
	}
	catch(NullPointerException ex)
	{
		System.out.println("Handle the exception"+ex.getMessage());
	}
	
	
	/*System.out.println("********Ascending and descending order in List using TreeSet******");
	TreeSet<Integer>Tr=new TreeSet<Integer>(ar);
	System.out.println("List in ascending order"+Tr);

	System.out.println("List in descending order"+Tr.descendingSet());
	*/
	}

}
