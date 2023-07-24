package KavithaKuriya;

import java.util.Scanner;

public class namAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name= reader.nextLine();
		System.out.println("Enter your age:");
		int age=reader.nextInt();
		System.out.println("The name is :"+name);
		System.out.println("The age is:"+age);

	}

}
