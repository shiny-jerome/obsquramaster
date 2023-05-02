package Gopikrishnan;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark: ");
		int mark=sc.nextInt();
		if(mark<40) {
			System.out.println("failed");
		}
		else if (mark<=60) {
			System.out.println("D");
		}
		else if (mark<=70) {
			System.out.println("C");
		}
		else if (mark<=80) {
			System.out.println("B");
		}
		else if (mark<=100) {
			System.out.println("A");
		}
		else {
			System.out.println("invalid mark");
		}
		
		

	}

}
