package vishnu;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=reader.nextInt();
        int array[]=new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i]=reader.nextInt();
        }
        
        for (int i=0;i<size-1;i++) 
        {
            for (int j=0;j<size-1;j++) 
            {
                if (array[j]>array[j+1]) 
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array:");
        for (int i=0;i<size;i++) 
        {
            System.out.print(array[i]+" ");
        }
    }
}