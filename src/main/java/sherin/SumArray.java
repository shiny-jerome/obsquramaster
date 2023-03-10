package sherin;
import java.util.*;

public class SumArray {
	public static void main (String args[])
	{
		Scanner reader=new Scanner(System.in);

		System.out.println("Enter the number of  elements in the array");
		int number=reader.nextInt();
		System.out.println("The numbers are");
		int arr[]=new int [number];
		int sum=0;
		for (int i=0; i<number; i++)
		{
			 arr[i]=reader.nextInt();
		}
				
			for(int j=0;j<number;j++)
		{
			sum=sum+arr[j];
			
		}
		System.out.println("The sum of the  numbers in the array  " +sum);
}
	
}
