package Gopikrishnan;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int t=0;
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
		
	}

}
