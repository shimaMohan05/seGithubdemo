package practice;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s="Java is the programming language";
		System.out.println("index of programming"+s.indexOf("programming"));
		System.out.println("index of p"+s.indexOf('p'));
		System.out.println("remove spaces: "+s.replaceAll("\\s", ""));
		System.out.println("To lowercase::  "+s.toLowerCase() );
		System.out.println("To uppercase::  "+s.toUpperCase());
		String s1="we are using java in se. ";
		System.out.println("replace programming with space"+s.replace("programming", "object oriented "));
		System.out.println(s);
		System.out.println(s+s1);
		System.out.println(s);//result is previous s only because string is immutable

	}

}
