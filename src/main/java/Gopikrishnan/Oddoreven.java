package Gopikrishnan;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter number to check odd or even: ");
		int num=reader.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
