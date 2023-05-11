package Gopikrishnan;

import java.util.Scanner;

public class Banking {
	static int totalbalance=0;
	Banking bg=new Banking();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to deposit ");
		int depo=sc.nextInt();
		deposit(depo);
		int total=totalbalance;
		showbalance(totalbalance);
		
	
		
		

	}
	
	
	public static int deposit(int dep) {
		
		int amount=dep;
		System.out.println("deposited amount "+amount);
		return amount;
		
		
	}
	public static int showbalance(int amou) {
		System.out.println("ypur balance is "+amou);
		totalbalance=0+amou;
		return amou;
	}
	public static void withdraw(int withdr) {
		int amou=withdr;
		//totalb
		
	}
	

}
