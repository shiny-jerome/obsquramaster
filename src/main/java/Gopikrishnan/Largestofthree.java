package Gopikrishnan;

import java.util.Scanner;

public class Largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=reader.nextInt();
		System.out.println("enter second number");
		int num2=reader.nextInt();
		System.out.println("enter third number");
		int num3=reader.nextInt();
		if (num1>num2) {
			System.out.println(num1+"is bigger");
		}
		else if (num2>num1) {
			System.out.println(num2+"is bigger");
			
		}
		else if(num3>num2){
			System.out.println(num3+" is bigger");
		}
	}

}
