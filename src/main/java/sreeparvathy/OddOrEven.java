package sreeparvathy;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println(" Enter number");
		int num=reader.nextInt();
			if(num%2==0) 
				{
					System.out.println("Number is Even");
				}
			else 
				{
					System.out.println("Number is Odd");
				}

	}

}
