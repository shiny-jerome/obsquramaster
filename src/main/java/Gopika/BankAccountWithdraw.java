package Gopika;

import java.util.Scanner;

public class BankAccountWithdraw {
	static int depo,withdraw;
public static void depoAndWithdraw(int d,int w)
{    depo=d;
     withdraw =w;
	
        if (d<w)
		System.out.println("Invalid Transaction");
	
	
}
public static void balance(int dep, int wit)
{   
	
	 depo = dep;
     withdraw = wit;
	int b = dep-wit;
	System.out.println("Balance Amount:"+b);
}
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the amount to be deposited");
	 depo = reader.nextInt();
	System.out.println("Enter the amount to be withdrawed");
	 withdraw = reader.nextInt();
	depoAndWithdraw(depo,withdraw);
 balance(depo,withdraw);
}
}
