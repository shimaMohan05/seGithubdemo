package week1;

import java.util.Scanner;

public class ReverseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
	
	int r=0;
	int sum=0;
	/*int number=0;
	for(int i=1;i<=3;i++)
	
	{
		number=num%10;
		num=num/10;
		System.out.print(number);
	}*/
	while(num>0)
	{
		r=num%10;
		num=num/10;
		sum=sum*10+r;
	}
	
	System.out.println(sum);

	}

}
