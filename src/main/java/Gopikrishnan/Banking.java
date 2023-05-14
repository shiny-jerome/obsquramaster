package Gopikrishnan;

import java.util.Scanner;

public class Banking {
	static int totalbalance=0;// eath functionil veno call cheyyam class object venda
	Banking bg=new Banking();
int a=0;//functionil call cheyyan class nte obj create cheyyanam
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to deposit ");
		int depo=sc.nextInt();
		deposit(depo);
		int total=totalbalance;
		showbalance(totalbalance);
		
	
		
		

	}
	
	
	public static void deposit(int dep) {
		
		totalbalance=totalbalance+dep;
		System.out.println("deposited amount "+amount);
		//return amount;
		
		
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
