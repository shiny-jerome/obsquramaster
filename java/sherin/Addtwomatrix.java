package sherin;
import java.util.*;

public class Addtwomatrix {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("The multiplication of two matrices");
		System.out.println("Enter the number of rows of  matrix");
		int r1=reader.nextInt();
		System.out.println("Enter the number of coloumn of matrix ");
		int c1=reader.nextInt();
		System.out.println("Enter the array");
		int arr1[][]=new int [r1][c1];
		int arr2[][]=new int [r1][c1];
		int arr3[][]=new int[r1][c1];
		int sum=0;
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=reader.nextInt();
		}
		
		}
		System.out.println("Enter the second matrix");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				 arr2[i][j]=reader.nextInt();
		}
		}
		System.out.println("The sum of the  two matrixes ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
		 arr3[i][j]= arr1[i][j]+arr2[i][j];
		 System.out.print(arr3[i][j]);
		 System.out.print("    ");
		
	}
		System.out.println();	
		}

}
	}

