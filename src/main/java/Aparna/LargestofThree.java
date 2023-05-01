package Aparna;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=reader.nextInt();
		System.out.println("Enter the second number");
		int b=reader.nextInt();
		System.out.println("Enter the third number");
		int c=reader.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The greater number is:"+a);
		}
		if(b>a&&b>c)
		{
			System.out.println("The greater number is:"+b);
			
		}
		else
		{
			System.out.println("The greater number is:"+c);
		}

	}

}
