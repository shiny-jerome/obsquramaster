package Gopikrishnan;
import java.util.Scanner;

public class Vt {
	static int total;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many items");
		int item=sc.nextInt();
		int itemstore[]=new int[item];
		System.out.println("Enter the Amounts: ");  
		for(int i=0; i<item; i++)  
		{  
		//reading array elements from the user   
		itemstore[i]=sc.nextInt();  
		} 
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<itemstore.length; i++)   
		{  
		total=total+itemstore[i];
		}  
		System.out.println("total amount "+total);


	}

}
