package sherin;
import java.util.*;
public class LinearSearch {
	public static void main(String args[])
	{
		
			Scanner reader=new Scanner(System.in);
			System.out.println("Enter the number of numbers");
			int number=reader.nextInt();
				int array[]=new int[number];
				System.out.println("Enter the numbers");
			for(int i=0;i<number;i++)
			{
			
			array[i]=reader.nextInt();
	}
			System.out.println("The entered numbers to be search ");
			int search=reader.nextInt();
			for(int j=0;j<array.length;j++)
			{
				if(search==array[j])
				{
		
			System.out.println(search+ "is found in "+(j+1) +"th position" );
			
			}
			}
		
	}

}

