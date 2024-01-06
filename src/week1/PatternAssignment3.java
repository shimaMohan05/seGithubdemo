package week1;

public class PatternAssignment3 {

	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=4;i++)
			
		{
			
			for(int j=1;j<=i;j++)
		{
		System.out.print((j+n)+ " ");//first iteration n=0;
		//second iteration n=1(0+1)
		//third iteration n=3(1+2)
		//4th iteration n=6(3+3)
		}
			
			n=n+i;
		System.out.println();	
		}

	}

}
