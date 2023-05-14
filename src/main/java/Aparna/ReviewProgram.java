package Aparna;

import java.util.Scanner;

public class ReviewProgram
{

	public static void main(String[] args)
	{


		Scanner reader=new Scanner(System.in);
		System.out.println("1.Palindrome");
		System.out.println("2.Odd or even");
		System.out.println("3.Vowel or not");
		
		String c="";
		do
		{
		
		System.out.println("Enter your choice");
		int programs=reader.nextInt();
		
		char option;
		switch(programs)
		{
		case 1:
			
			System.out.println("Enter a number to check wheather its palindrome or not");
			int number=reader.nextInt();
			int reverse=0;
			
			int temp=number;
			
			while(number!=0)
			{
				int remainder=number%10;
				reverse=reverse*10+remainder;
				number=number/10;
			}
			if (temp==reverse)
			{
				System.out.println("The number is palindrome");
			}
			else
			{
				System.out.println("The number is not palindrome");
			}
		
		break;
		
		case 2:
			
			System.out.println("Enter any number");
			int num=reader.nextInt();
			
			if(num%2==0)
			{
				System.out.println("The numeber is Even");
			}
			else
			{
				System.out.println("The number is Odd");
			}

		break;
		
		case 3:
			
			System.out.println("Enter any letter");
			char letter=reader.next().charAt(0);
			
			switch (letter)
			{
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			default:
					System.out.println("Not a vowel");
					break;
			}
		
			System.out.println("do you want to continue");
			option=reader.next().charAt(0);
			
		}	
			}
		while(c.equalsIgnoreCase("Y"));
			
		}
		

	}


