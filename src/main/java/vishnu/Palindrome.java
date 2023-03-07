package vishnu;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number to check wheather its palindrome or not");
		int number=reader.nextInt();
		int reverse=0;
		
		int temp=number;
		
		while(number!=0)
		{
			int remainder=number/10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if (temp==reverse)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}

}
