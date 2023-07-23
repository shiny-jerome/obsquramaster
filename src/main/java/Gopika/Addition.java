package Gopika;

import java.util.Scanner;

public class Addition {
	public static void main (String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = reader.nextInt();
		System.out.println("Enter your second number");
		int b = reader.nextInt();
		int sum = a+b;
		System.out.println("Sum ="+sum);
		
				
	}

}
