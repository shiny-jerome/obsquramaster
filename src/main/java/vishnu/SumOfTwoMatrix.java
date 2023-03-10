package vishnu;
import java.util.Scanner;
public class SumOfTwoMatrix {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size=reader.nextInt();
		int array1[][]=new int[size][size];
		int array2[][]=new int[size][size];
		int array3[][]=new int[size][size];
		int sum=0;
		
		System.out.println("Enter the numbers for first array");
		for (int i=0;i<array1.length;i++)
		{
			for (int j=0;j<array1.length;j++)
			{
				array1[i][j]=reader.nextInt();
			}
		}
		
		System.out.println("Enter the numbers for second array");
		for (int i=0;i<array2.length;i++)
		{
			for (int j=0;j<array2.length;j++)
			{
				array2[i][j]=reader.nextInt();
			}
		}
		
		for (int i=0;i<array1.length;i++)
		{
			for (int j=0;j<array1.length;j++)
			{
				array3[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Sum of matrix:");
		for (int i=0;i<array1.length;i++)
		{
			for (int j=0;j<array1.length;j++)
			{
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
