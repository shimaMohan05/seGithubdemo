package practice;

 class ZeroException extends Exception
{
	}

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int a=23;
		int b=0;
		int c;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("division by zero is not possible");
		}
		try
		{
			c=a*b;
			if(c==0)
			{
				throw new ZeroException() ;
				
			}
		}
		catch(ZeroException ze)
		{
			System.out.println("newly added exception");
		}
		
		
	}

}
