package week1;

public class SwappingDemo {
	public static void main(String[] args) {
		int num1=10;
		int num2=25;
		System.out.println("First number is "+num1);
		System.out.println("Second number is "+num2);
		/*int dummy=num1;
		num1=num2;
		num2=dummy;*/
		num1=num1+num2;//35
		num2=num1-num2;//35-25=10
		num1=num1-num2;//35-10=25
		System.out.println("First number after swaping is "+num1);
		System.out.println("Second number after swaping is "+num2);
		
	}
}
