package Aparna;

import java.util.Scanner;

public class CountOddEven 
{

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num1=reader.nextInt();
		
		int evenCount=0;
		int oddCount=0;
		for(int i=1;i<=num1;i++)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even number count:"+evenCount);
		System.out.println("Odd number count:"+oddCount);

	}

}


