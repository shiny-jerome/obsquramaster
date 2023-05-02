package Gopikrishnan;

import java.util.Scanner;

public class Eligibleornot {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter your age: ");
		int age=reader.nextInt();
		if (age<18) {
			System.out.println("not eligible for driving licence");
		}
		else {
			System.out.println("eligible for driving licence");
		}
	}

}
