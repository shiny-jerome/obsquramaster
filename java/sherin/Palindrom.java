package sherin;
import java.util.*;

public class Palindrom {
public static void main(String args[])
{
      int number,reverse=0, r, temp;
	System.out.println("Enter the number");
	Scanner word=new Scanner (System.in);
	number=word.nextInt();
	temp=number;
	while(number>0)
	{
		
		 r=number%10;
reverse=reverse*10+r;
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
