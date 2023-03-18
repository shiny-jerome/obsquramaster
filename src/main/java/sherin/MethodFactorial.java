package sherin;
import java.util.*;
public class MethodFactorial {
	public static void main(String args[])

	{
		System.out.println("Enter the number ");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		factorial (n);
		
	}
	public static void factorial(int n)
	{
		int fact=1;
		for( int i=1;i<=n;i++)
					{
			fact=fact*i;
			
}
		System.out.println("The factorial of " +n+"  is  "+fact);
		
}
}