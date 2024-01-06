package assignment;

import java.util.Scanner;

public class ReverseMethodDemo {

	public static void main(String[] args) {
		System.out.println("Enter the String to reverse:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s) ;
		sb.reverse();
		System.out.println("reversed string using StringBuffer is: "+sb);
		StringBuilder sr=new StringBuilder(s);
		sr.reverse();
		System.out.println("reversed string using StringBuilder is: "+sr);

	}

}
