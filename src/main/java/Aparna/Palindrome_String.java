package Aparna;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextInt();
		String org=str;
		String rev=" ";
		String length=str.length();
	
		for(int i.length-1;i>=0;i--)
		{
			int rev=rev+str.charAt(i);
		}
if(org.equals(rev))
{
	System.out.println(org+"palindrome");
}
else
{
	System.out.println("not palindrome");
}
	}

}
