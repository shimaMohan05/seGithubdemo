package practice;

public class ArmStrong {

	public static void main(String[] args) {
		int a=254;
		int temp=0;int b;
		int c=0;
		
		while(a>0)
		{
			temp=a;
		
		b=a%10;
		a=a/10;
		c=c+(b*b*b);
		}
	if(c==temp)
		System.out.println("number is armstrong");
	else
		System.out.println("number is not armstrong");

	}

}
