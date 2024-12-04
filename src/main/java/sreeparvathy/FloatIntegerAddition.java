package sreeparvathy;

import java.util.Scanner;

public class FloatIntegerAddition {
	
		public static void main(String args[]) 
			{
				Scanner reader=new Scanner(System.in);
				System.out.println("Enter first number");
				int a=reader.nextInt();
				System.out.println("Enter second number");
				float b=reader.nextFloat();
				float c=a+b;
				System.out.println("Sum= "+c);
				
			}
	

}
