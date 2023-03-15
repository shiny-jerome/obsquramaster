package vishnu;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		char wish;
		int total=1000000;
		int deposit=0;
		int withdraw=0;
		
	do
	{
		System.out.println("Welcome to OBSQURA BANK \nChoose your service: \n1. Deposit \n2. Withdraw \n3. Check Balance");
		int opt=reader.nextInt();
		
		switch(opt)
		{
		case 1:
			System.out.println("Enter the amount you need to add: ");
			deposit=reader.nextInt();
			deposit(deposit,total);

			System.out.println("Succesfully deposited1 the amount!");
			break;
		case 2:
			System.out.println("Enter the amount to withdraw");
			withdraw=reader.nextInt();
			withdraw(withdraw,total);
			System.out.println("Succesfully withdrawn the amount");
			break;
		case 3:			
			currentBalance(total,deposit,withdraw);
			break;
		}
		System.out.println("Do you wish to do again?/npress 'y' for YES and 'n' for NO");
		wish=reader.next().charAt(0);
	}
	while(wish=='y');
	
   }
	public static void deposit(int deposit, int total)
	{
		total=total+deposit;
		
	}
	public static void withdraw(int withdraw, int total)
	{
		if (total>withdraw)
		{
		total=total-withdraw;
		}
		else
		{
			System.out.println("Insufficient fund!");
		}
		
	}
	public static void currentBalance(int total,int deposit, int withdraw)
	{
		int currBalance=total+deposit-withdraw;
		System.out.println("Balance: "+currBalance);
	}
}