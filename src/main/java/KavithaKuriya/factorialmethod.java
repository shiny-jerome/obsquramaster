package KavithaKuriya;

import java.util.Scanner;

public class factorialmethod {

	public static int factorial(int num)
	{
		if(num==0||num==1)
		{
			return 1;
		}else
		{
			return num*factorial(num-1);
		}
	}
	
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter number you want to find the factorial");
		int givenNumber=reader.nextInt();
		int result=factorial(givenNumber);
		System.out.println("the factorial of the given number is-------->"+result);
		
	}
}
