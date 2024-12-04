package sreeparvathy;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int rev=0,temp;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=reader.nextInt();
		while(num!=0) 
			{
				temp=num%10;
				rev=rev*10+temp;
				num=num/10;
			}
		System.out.println("Reverse of a number "+rev);
		
	}

}
