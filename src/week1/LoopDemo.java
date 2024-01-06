package week1;

public class LoopDemo {

	public static void main(String[] args) {
		// TO print hello 5 times
/*for(int i=1;i<=5;i++)
{System.out.println("Hello");
	}*/
	/*	int i=1;
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
		
	}*/
		int i=1;
		do{
			System.out.println("Hello");
			i++;
			}
		while(i<=5);
		
		//sum of digits digit=126,sum=1+2+6=9
		/*int num=126;
		int r=0;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		System.out.println(sum);*/
	}
}
