package Aparna;

import java.util.Scanner;

public class License {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=reader.nextInt();
		if(age>18)
			System.out.println("Eligible for Driving License");
		else
		{
			System.out.println("Not Eligible for Driving License");
		}

	}

}
