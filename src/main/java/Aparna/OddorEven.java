package Aparna;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=reader.nextInt();
		if(a%2==0) 
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}
