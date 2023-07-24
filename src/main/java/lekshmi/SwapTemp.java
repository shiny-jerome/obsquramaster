package lekshmi;
import java.util.Scanner;
public class SwapTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first no");
		int a=reader.nextInt();
		System.out.println("Enter the second no");
		int b=reader.nextInt();
		System.out.println("Before Swap");
		System.out.println("Enter the first no" +a);
		System.out.println("Enter the second no"+b);
		int temp = a;
		    a=b;
		    b=temp;
		System.out.println("After Swap");
		System.out.println("Enter the first no" +a);
		System.out.println("Enter the second no"+b);
		}
		
	}


