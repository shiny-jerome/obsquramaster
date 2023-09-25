package Gopika;

import java.util.Scanner;

public class BankAccount {
int amnt,acntnum,wd;

public static void details(int a, int no, int w) {
	int amnt=a;
	
	int wd=w;
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter account number:");
	no=  reader.nextInt();
	System.out.println("Enter the amount to be deposited");
	a=  reader.nextInt();
	System.out.println("Enter the amount to be withdrawn");
	w=  reader.nextInt();
	if(w<=a)
	
		System.out.println("Withdraw Amount:"+w);
		
	else
		System.out.println("Insufficient Balance");
		
}

public static void balance(int d, int wi)
{
	int amount = d;
	int wd = wi;
	int b =d-wi;
	System.out.println("Balance Amount:"+d);
	
}
public static void main(String args[])
{   BankAccount obj =new BankAccount();

	obj.amnt=0;
	obj.acntnum=0;
	obj.wd=0;
	
	
}
}
