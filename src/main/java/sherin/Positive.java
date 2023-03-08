package sherin;
import java.util.Scanner;

public class Positive {
	
				

			public static void main(String[] args)
			{
								
				Scanner reader=new Scanner (System.in);
				System.out.println("Enter the number  ");
				int number =reader.nextInt();
				if(number>0)
				{
					System.out.println("The entered number is positive");
				}
				else if (number==0)
				{
					System.out.println("The entered number is Zero ");
				}
				else
				{
					System.out.println("The entered number is negative");
				}
				}

}
