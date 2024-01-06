package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) throws IOException {
	/*	System.out.println("Age of deepa is :");//i am passing 22 as age
	int i=	System.in.read();//it will read as character and one character only will read so just'2'
	System.out.println("That age is :" +i);//return ascii of 2 which is 50
	*/
		/*bufferreader also can use but it is lengthy process
		 * 
		 
		System.out.println("Enter age is:");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String s=br.readLine();
		int age1=Integer.parseInt(s);
		System.out.println(age1);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name is:");
		String name=sc.nextLine();
		System.out.println("Enter age is:");
		int age=sc.nextInt();
		


System.out.println("Enter phone number:");
long phno=sc.nextLong();

System.out.println("age is :" +age);
System.out.println("name is:" +name);
System.out.println("phone number is:"+ phno);
	}

}
