package Gopika;

import java.util.Scanner;

public class ArrayMethod {
	static int n;
	static int a[];
	public static void createArray(int a[])
	   {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the array");
	for(int i=0; i<n;i++)
	     {
	a[i]= reader.nextInt();
	     }
	}

	public static void display()
	{
	for (int i=0;i<a.length;i++)
	  {
	System.out.print(a[i]);
	   }
	}

	public static void main(String args[])
	{

	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	n =reader.nextInt();
	a = new int [n];
    createArray(a);
	display();
	}
}
