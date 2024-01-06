package week1;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage:");
	int percentage=	sc.nextInt();
	if(percentage>=95)
	{
		System.out.println("scored A+");

	}
	else if((percentage>=90)&&(percentage<95))
	{
		System.out.println("scored A");
	}
	else if ((percentage<90)&&(percentage>=80) )
	{
		System.out.println("scored B+");
	}
	else if ((percentage<80)&&(percentage>=60))
	{
		System.out.println("scored B");
	}
	else
	{
		System.out.println("failed");
	}

}}
