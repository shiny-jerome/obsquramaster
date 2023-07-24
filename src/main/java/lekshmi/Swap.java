package lekshmi;
import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the first no");
	int a=reader.nextInt();
	System.out.println("Enter the second no");
	int b=reader.nextInt();
	System.out.println("Before Swap");
	System.out.println("Enter the first no" +a);
	System.out.println("Enter the second no"+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	System.out.println("After Swap");
	System.out.println("Enter the first no" +a);
	System.out.println("Enter the second no"+b);
	}
	}

