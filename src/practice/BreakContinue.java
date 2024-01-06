package practice;

public class BreakContinue {

	public static void main(String[] args) {
	int[]a= {12,13,23,24,45,56,67,};
	for(int i:a)
	{
	if(i==23)
	{
		//break;//12
		continue;//12,12,24,45,56,67
	}
	
	System.out.println(i);
	}
	}
}
