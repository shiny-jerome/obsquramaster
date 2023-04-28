package vishnu;
import java.util.Scanner;
public class PalindromeUsingMethod {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number to check whether the number is palindrome or not");
		int num=reader.nextInt();
		int temp=num;
		int s1=reverse(num);
		check(temp,s1);
		
	}
	
	public static int reverse(int num)
	{
		int reverse=0;
		while(num!=0)      
		{
			int remainder=num%10; 
			reverse=reverse*10+remainder; 
			num=num/10;
		}
		return reverse;
	}
	
	public static void check(int temp,int reversed)
	{
		if (temp==reversed)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}
}
