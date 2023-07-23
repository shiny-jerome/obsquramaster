package Gopika;

import java.util.Scanner;

public class AddIntFloat {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter one integer number");
		int a = reader.nextInt();
		System.out.println("Enter one floating number");
		float b = reader.nextFloat();
		float sum= a+b;
		System.out.println("Sum="+sum);
		
	}

}
