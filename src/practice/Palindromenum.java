package practice;

public class Palindromenum {

	public static void main(String[] args) {
		int num=1221;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			
			rev=(rev*10)+(num%10);//12
			num=num/10;//12
			
		}
		System.out.println(rev);
		if(rev==temp)
			System.out.println("number is palindrome");
		else
			System.out.println("not palindrome");

	}

}
