package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class NullPointerExceptionAssignment {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(30);
		al.add(22);
		al.add(34);
		al.add(60);
		al.add(45);
		al.add(12);
		al.add(5);
		al.add(80);
		al.add(null);
		try
		{
		Collections.sort(al);
		System.out.println("Ascending ordered arraylist is: " +al);
		}
		catch(NullPointerException ex)
		{
			System.out.println("cant sort the null contained arraylist");
			System.out.println("Avoid null entry");
		}
		for(Integer i:al)
		System.out.println(i);
		
	

	}

}
