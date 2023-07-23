package Gopika;

import java.util.Scanner;

public class SwapWithoutTemp {
	public static void main(String args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a= reader.nextInt();
	int b= reader.nextInt();
	System.out.println("Numbers before swapping are:a=" +a+" b="+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	System.out.println("Numbers after swapping are:a=" +a+" b="+b);
	}
}
