package week2;

public class ArrayDemo {

	public static void main(String[] args) {
		int r[][]=new int[2][3];
		r[0][0]=8;
		r[0][1]=9;
		r[0][2]=10;
		r[1][0]=11;
		r[1][1]=12;
		r[1][2]=13;
	
		for(int i[]:r)
		{
			for(int j:i)
			{
				System.out.print(j +" \t "); 
			}
			System.out.println(" ");
		}
		int a[]= {3,4,5,6,7};
		for(int i: a)
		{System.out.print(i +"  ");
		}
		
		int b[][]= {{2,3},{4,5,6},{3,4}};
		for(int i[]:b)
		{
			for(int j:i)
			{
				System.out.print(j +" \t "); 
			}
			System.out.println(" ");
		}}
		
	}


