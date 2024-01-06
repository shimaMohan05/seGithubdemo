package week1;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		char []vowel= {'a','e','i','o','u'};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet for checking is it vowel or not:");
		String s=sc.nextLine();
		char c=s.charAt(0);
		if((c==vowel[0])||(c==vowel[1])||(c==vowel[2])||(c==vowel[3])||(c==vowel[4]))
		{
			System.out.println("Entered character is vowel");
		}
		else
		{
			System.out.println("Entered character is not vowel");
		}

	}

}
