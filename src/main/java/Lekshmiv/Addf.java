package Lekshmiv;
import java.util.Scanner;
public class Addf {
	
	
	public static void main(String args[]) 
	{
			
			Scanner reader=new Scanner(System.in);
			System.out.println("Enter integer number");
			int a=reader.nextInt();
			System.out.println("Enter float number");
			float b=reader.nextFloat();
			float c=a+b;
			System.out.println("The sum is"+c);
		}

	}


