package KavithaKuriya;

import java.util.Scanner;



// Write a program to check whether the given number is Palindrome/Not by using static methods.
//Method 1- to find the reverse(pass the number in argument)
//Method 2-to check palindrome/not

public class palindrom {
	static char []text;
	static int i;
	static String reverse="",temp="";
	
	public static void reversemethod()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the number you want to reverse");
		int number=reader.nextInt();
		String str=Integer.toString(number);
		temp=str;
		text=temp.toCharArray();		
		for(i=text.length-1; i >= 0;i--)
		{
			reverse=reverse+text[i];
//			System.out.println(reverse);
			
		}
	}
	public static void palindrom()
	{
		if(temp.equals(reverse))
		    {
			System.out.println("The number is palindrom");
			}else 
			{
			System.out.println("The number is not palindrom");
			}
	}
		
	
	public static void main(String args[])
	{
		reversemethod();
		palindrom();
	}
	

}
