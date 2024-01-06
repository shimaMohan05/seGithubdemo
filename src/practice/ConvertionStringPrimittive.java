package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConvertionStringPrimittive {

	public static void main(String[] args) {
		String s="1234";
		String s1="Shima";
		//int k=Integer.parseInt(s1);will throw numberformat exception
	int i=Integer.parseInt(s);
		//System.out.println(i);
		
		int j=23;
		String s2=String.valueOf(j);
		String s3=Integer.toString(j);
		System.out.println(s2);
		System.out.println(s3);
		char c='A';
		int k=c;
		System.out.println(k);
		int l=67;
		char d=(char)l;
		System.out.println(d);
		String[] str= {"acv","sdf","cfg"};
		String s4=Arrays.toString(str);
		System.out.println(s4);

	}

}
