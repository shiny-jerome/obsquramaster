package sreeparvathy;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		int rev=0,d,temp;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=reader.nextInt();
		temp=num;
		while(num!=0) 
			{
				d=num%10;
				rev=rev*10+d;
				num=num/10;
			}
		if(temp==rev) 
			{
				System.out.println(temp+" is a Palindrome number");
			}
		else 
			{
				System.out.println(temp+" is not a Palindrome number");
			}

	}

}
