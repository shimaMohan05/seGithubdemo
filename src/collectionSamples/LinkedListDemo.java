package collectionSamples;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {

	public static void main(String[] args) {
		//Duplicates allowed
		//Doubly nodded data structure
		//ordered iteration means Index based
		//insertion and deletion easily
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(23);
		l1.add(34);
		l1.add(15);
		l1.add(56);
		l1.add(8);
		l1.add(78);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.contains(56));
		System.out.println(l1.isEmpty());
		System.out.println("****Iteration using for loop****");
l1.addFirst(67);
l1.addLast(89);

		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("******Iteration using for each**********");
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		Iterator<Integer> ir=l1.iterator();
		System.out.println("*********Iteration using iterato()***********");
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		System.out.println("Sorting by sort()");
		Collections.sort(l1);
		System.out.println("Sorted list "+l1);
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		TreeSet<Integer>tr=new TreeSet<Integer>(l1);
		System.out.println("Treeset is "+tr);
		tr.descendingSet();
		System.out.println("Descending ordered treeset is"+tr);
		System.out.println("Descending order  treeset is"+tr.descendingSet());
	}

}
