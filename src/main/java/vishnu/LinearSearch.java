package vishnu;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int size=reader.nextInt();
		int array[]=new int[size];
		boolean found=false;
		
		System.out.println("Enter the numbers");
		for (int i=0;i<array.length;i++)
		{
			array[i]=reader.nextInt();
		}
		
		System.out.println("Enter the key element to search in the array");
		int key=reader.nextInt();
		
		for (int i = 0; i < size; i++) 
		{
            if (array[i] == key) 
            {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element not found in the array.");
        }

		
	}

}
