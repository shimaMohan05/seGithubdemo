package practice;

public class MultiArray {
	public void show()
	{}
	public void show1()
	{
		show();
	}

	public static void main(String[] args) {
		int a[][]= {{12,45},{56,67},{24,78}};
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		String s ="shima";
		s.concat("mohan");
		System.out.println(s);
		System.out.println(s.concat("mohan"));
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i); 
		}
		
		System.out.println(rev);

	}

}
