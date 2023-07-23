 package Gopika;

import java.util.Scanner;

public class OddOrEven 
	{
		public static void main(String args[])
		{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int a = reader.nextInt();
		if(a%2==0)
		System.out.println("Even number");
		else
		System.out.println("Odd number");
		}
		
}
