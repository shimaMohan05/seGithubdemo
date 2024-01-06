package practice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		
		String reverse="";
		for(int i=(s.length())-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println("reverse of the number: "+reverse);

	}

}
