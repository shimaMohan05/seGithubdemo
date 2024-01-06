package practice;

public class MetrixAddition {

	public static void main(String[] args) {
		int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{5,3,7},{1,8,9},{12,67,34}};
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
