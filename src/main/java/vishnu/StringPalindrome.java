package vishnu;

public class StringPalindrome {
	
	public StringPalindrome(String a)
	{
		String newWord="";
		for (int i=a.length()-1;i>=0;i--)
		{
			newWord=newWord+a.charAt(i);
		}
		if(a.equals(newWord))
		{
			System.out.println("This word is palindrome");
		}
		else
		{
			System.out.println("This word is not palindrome");
		}
	}

}
