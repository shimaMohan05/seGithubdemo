package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingAssignment {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(45);
		al.add(30);
		al.add(25);
		al.add(100);
		al.add(10);
		al.add(32);
		al.add(45);
		al.add(75);
		System.out.println("Before sorting: "+al);
		Collections.sort(al);
		System.out.println("List in ascending order: " +al);
		

	}

}
