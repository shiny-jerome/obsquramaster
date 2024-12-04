package sreeparvathy;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=reader.nextInt();
		System.out.println("Enter second number");
		int b=reader.nextInt();
		System.out.println("Enter third number");
		int c=reader.nextInt();
		if(a>b && a>c) 
			{
				System.out.println("Largest number= "+a);
			}
		else if(b>a && b>c) 
			{
				System.out.println("Largest number= "+b);
			}
		else 
			{
				System.out.println("Largest number= "+c);
			}
				
	}

}
