package sherin;

import java.util.Scanner;

public class Atmuserclass{
	public static void mian(String args[])
	{
		System.out.println("Enter the PIN");
		Scanner reader=new Scanner(System.in);
		int pin=reader.nextInt();
		 AtmBankclass obj=new  AtmBankclass();
		 obj.setPin(pin);
	}
	
	}


