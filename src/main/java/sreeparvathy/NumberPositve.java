package sreeparvathy;

import java.util.Scanner;

public class NumberPositve {

	public static void main(String[] args) {
	
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter number");
		int a=reader.nextInt();
			if(a>0) 
				{
				   System.out.println("Positive");
				   
				}
			else 
				{
					System.out.println("Negative");
				}
	}

}
