package week1;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("entered number is postive");
		}
		else if (num<0)
		{
			System.out.println("entered number is negative");
		}
		else
		{
			System.out.println("neither postive nor negative means zero ");
		}
	}

}
