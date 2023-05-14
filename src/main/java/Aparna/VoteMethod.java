package Aparna;

import java.util.Scanner;


public class VoteMethod
{
	static int age;
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter the age of the cantidate: ");
		int age=reader.nextInt();
		voting();
		
		

	}
public static boolean voting()
{
	boolean voting=false;
	if(age>=18)
	{
		System.out.println("eligible");
		return true;
	}
	else
	{
		System.out.println("not eligible");
	}
	
	
}
}
