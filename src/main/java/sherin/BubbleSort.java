package sherin;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main (String arg[])
	{
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		int number=reader.nextInt();
		int temp=0;
			int array[]=new int[number];
			System.out.println("Enter the numbers");
		for(int i=0;i<number;i++)
		{
		
		array[i]=reader.nextInt();
}
		System.out.println("The numbers in the ascending order");
		
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<(number-1);j++)
			{
			
				if (array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			
		}
	}
		
		for(int i=0;i<number;i++)
		{
		System.out.print(array[i]+"  ");
	}}
}