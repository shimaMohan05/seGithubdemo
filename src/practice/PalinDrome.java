package practice;

public class PalinDrome {

	public static void main(String[] args) {
		String lang="Malayalam";
		String reverse="";
		for(int i=(lang.length())-1;i>=0;i--)
		{
			
			reverse=reverse+lang.charAt(i);
			
		}
		
		System.out.println("reversed string is::"+reverse);
		if(reverse.equals(lang))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
