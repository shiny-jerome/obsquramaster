package vishnu;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit for the array");
		int limit=reader.nextInt();
		int array[]=new int[limit];
		int sum=0;
		
		System.out.println("Enter array numbers");
		for (int i=0;i<array.length;i++)
		{
			array[i]=reader.nextInt();
		}
		
	
		for (int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		System.out.println("Sum of the array numbers = "+sum);

	}

}
