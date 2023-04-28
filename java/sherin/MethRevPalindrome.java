package sherin;
import java.util.*;

public class MethRevPalindrome {
	

public static void main(String args[])
{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the  number ");
	int number=reader.nextInt();
	
		palindrome(number);
		
	}
	
public static void palindrome(int num)
{
	 int temp=num;

	 	 
	 int revno=reverse(num );
	
	 if (temp==revno)
	 {
	 	System.out.println("The number is palindrome");
	 	
	 }
	 else
	 {
	 	System.out.println("The number is not palindrome");
	 }
			
}
public static  int  reverse(int num)
{
	
	int tem,rev=0;
	tem=num;
	while(num>0)
	{
		int r=num%10;
rev=rev*10+r;
num=num/10;

	}
	return rev;
	
}
}