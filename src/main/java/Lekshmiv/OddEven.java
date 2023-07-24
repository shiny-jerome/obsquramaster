package Lekshmiv;
import java.util.Scanner;


public class OddEven {
	
	public static void main(String args[]) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a valid number");
		int a=reader.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");
		}
		else
			System.out.println("The number is odd");
	}

}
