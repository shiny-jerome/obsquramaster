package KavithaKuriya;

import java.util.Scanner;

// Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not exceeds the current balance). 
//Add an extra method to check the account balance. (static 
//methods)
public class currentBalance {
	private static int balance = 0;
	
	public static void deposit(int amount)
	{
		balance=balance+amount;
	}
	public static void withdraw(int amount)
	{
		if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds the current balance.");
        }
	}
	
	public static  int checkbalance()
	
	{
		return balance;
	}
	public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the initial balance: ");
	        balance = scanner.nextInt();

	        System.out.print("Enter the amount to deposit: ");
	        int depositAmount = scanner.nextInt();
	        deposit(depositAmount);

	        System.out.print("Enter the amount to withdraw: ");
	        int withdrawAmount = scanner.nextInt();
	        withdraw(withdrawAmount);

	         int currentBalance = checkbalance();
	        System.out.println("Current balance: " + currentBalance);
		
	}
    
}
