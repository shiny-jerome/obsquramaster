package sherin;
import java.util.*;
public class MethodBank {
	 static float savings=10000f;
	 
	 
	public static void main(String args[])
	{
		char opt;
		Scanner reader=new Scanner(System.in);
		
				do
		{
		System.out.println("1. Deposit\n 2.Withdrawl");
		System.out.println("Enter the choice");
		int c=reader.nextInt();
		switch(c)
		{
		case 1 :
			System.out.println("Enter the amout to be deposited ");
			//Scanner reader=new Scanner(System.in);
			float depo=reader.nextFloat();
			System.out.println("The amount deposited   "+depo);


			 deposit(depo);
			break;
		case 2:
		
		withdrawl();
		break;
		  
			}
		System.out.println("Do you want to continue? Y");
		 opt=reader.next().charAt(0);
		
			}
	while( opt=='y'||opt=='Y');
	}
	
public static void  deposit(float depo)
{
		
  savings=savings+depo;
  System.out.println("The final balance amount   "+savings);
}

public static void withdrawl()
{
	System.out.println("Enter the amount to be withdrw");
	Scanner reader=new Scanner (System.in);
	float withdraw=reader.nextFloat();
	
	if(balance(withdraw)==true)
			{
	System.out.println("The balace amount =" +(savings-withdraw));
	
}
	else
	{
		System.out.println("The withdrwal amount is larger than the Savings ");
	}
	}
public static boolean balance (float  amount)
{
	if(amount<savings)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}

