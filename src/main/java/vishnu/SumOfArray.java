package vishnu;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit for the array");
		int limit=reader.nextInt();
		int array1[]=new int[limit];
		int array2[]=new int[limit];
		int array[]=new int[limit];
		
		System.out.println("Enter array1 numbers");
		for (int i=0;i<array1.length;i++)
		{
			array1[i]=reader.nextInt();
		}
		
		System.out.println("Enter array2 numbers");
		for (int i=0;i<array2.length;i++)
		{
			array2[i]=reader.nextInt();
		}
	
		for (int i=0;i<array.length;i++)
		{
			array[i]=array1[i]+array2[i];
		}
		
		System.out.print("Sum of the array numbers = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

	}

}
