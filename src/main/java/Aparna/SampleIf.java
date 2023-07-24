package Aparna;

import java.util.Scanner;

public class SampleIf
{

	public static void main(String[] args)
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=reader.nextInt();
	if(num>0)
	{
		System.out.println("The number is Positive");
	}
	else
	{
		System.out.println("The number is negative");
	}
	

	}

}
