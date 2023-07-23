package Gopika;

import java.util.Scanner;

public class LargestOfNos {
	public static void main(String args[])
	{
	Scanner reader = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three numbers");
	a=reader.nextInt();
	b=reader.nextInt();
	c=reader.nextInt();
	if(a>b && a>c)
	System.out.println("Largest number is :"+a);
	else if(b>a && b>c)
	System.out.println("Largest number is :"+b);
	else
	System.out.println("Largest number is :"+c);
	}
}
