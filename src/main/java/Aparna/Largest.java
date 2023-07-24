package Aparna;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=reader.nextInt();
		System.out.println("Enter the second number");
		int num2=reader.nextInt();
		System.out.println("Enter the third number");
		int num3=reader.nextInt();
		
		 if(num1>num3&&num1>num2)
		{
			System.out.println("The greater number is first digit");
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("The greater number is second digit");
		}
		else 
		{
			System.out.println("The greater number is third digit");
		}
		

	}

}
