package Gopika;

import java.util.Scanner;

public class NameAndAge {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = reader.next();
		System.out.println("Enter your age");
		int age = reader.nextInt();
		System.out.println(name);
		System.out.println(age);
		
	}

}


