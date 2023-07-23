package Gopika;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String args[])
	{
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = reader.nextInt();
	if (a>0)
	{
	System.out.println("positive number");
	}
	else
	{
	System.out.println("negative number");
	}
	}

}
