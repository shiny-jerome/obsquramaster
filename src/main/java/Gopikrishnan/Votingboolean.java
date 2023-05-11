package Gopikrishnan;

import java.util.Scanner;

public class Votingboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
				if(vote(age)==true) {
					System.out.println("eligible");
				}
				else {
					System.out.println("not eligible");
				}
	}
	public static boolean vote(int n) {
		int num=n;
		if (num>=18) {
			//System.out.println("hi");
			return true;
			
		}
		else {
			//System.out.println("bo");
			return false;
		}
	}

}
