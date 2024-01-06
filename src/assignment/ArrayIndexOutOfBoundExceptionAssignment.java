package assignment;

public class ArrayIndexOutOfBoundExceptionAssignment {

	public static void main(String[] args) {
	
		int a[]=new int[5];
		a[0]=67;
		a[1]=50;
		a[2]=25;
		a[3]=45;
		a[4]=7;
		try
		{
		for(int i=0;i<=a.length;i++)
			System.out.println(a[i]);//i is index of array
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("index should start with 0 and ends with (legth-1)");
		}
		
		System.out.println("4th element in array is "+a[3]);

	}

}
