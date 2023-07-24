package Lekshmiv;

import java.util.Scanner;

public class Swap1 {

	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a");
		int a=reader.nextInt();
		System.out.println("Enter b");
		int b=reader.nextInt();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}
}
