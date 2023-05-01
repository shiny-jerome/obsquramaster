package Aparna;
 import java.util.Scanner;
public class AdditionScan 
{
	public static void main(String args[])
	{
	    Scanner reader=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=reader.nextInt();
		System.out.println("Enter the Second number:");
		int b =reader.nextInt();
		int c=a+b;
		System.out.println("The addition of two number is:"+c);
		
		
	}

}
