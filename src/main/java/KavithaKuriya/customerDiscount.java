package KavithaKuriya;

import java.util.Scanner;

/*
Write a program to check whether the customer have discount (get 20% discount if total amount 
is greater than 5000) or not and get the final amount in main method. (static methods)
 Get prices of items using parameterized method
 Method 1 - Calculate total amount
 Method 2 - Check discount
*/

public class customerDiscount {
	static double amount;
	public static double calculateDiscount(double item)
	{
			return  item*0.20;
	}
	public static void checkDiscount()
		{
		double discount = calculateDiscount(amount);
		 if (amount > 5000)
		 {
	            System.out.println("The discount amount is " + discount);
	     }else 
	     {
	            System.out.println("No discount");
	     }
	}
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=reader.nextDouble();
		checkDiscount();
	}
}
