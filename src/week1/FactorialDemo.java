package week1;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		
			
			System.out.println("Enter the number to find its factorial:");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			
for(int i=(num-1);i>=1;i--)
{
	num*=i;
	
}
System.out.println("Factorial of the number is : " +num);
	}

}
