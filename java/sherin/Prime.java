package sherin;
import java.util.*;
public class Prime {
	public static void main(String args[])
	{
		int i=0,flag=0;
	System.out.println("Enter the number ");
	Scanner num=new Scanner(System.in);
	int n=num.nextInt();
	if (n==0||n==1)
		System.out.println("The entered number is neither Prime nor composite");
	else
		
	{
		for(i=2;i<n;i++)
		{
			if (n%i==0)
				flag= flag+1;		
		}
		if (flag==0)
		{
			System.out.println("The number is prime");
		}
		else
			System.out.println("The entered number is not prime ");
	}
	}	

}
