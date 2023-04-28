package sherin;
import java.util.*;
public class MethodFactorial {
	public static void main(String args[])

	{
		System.out.println("Enter the number ");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		//factorial (n);
		int a=factorial(n);
		System.out.println("The factorial of " +n+"  is  "+a);
		
	}
	//public static void factorial(int n)

	public static int  factorial(int n)
	{
		int fact=1;
		for( int i=1;i<=n;i++)
					{
			fact=fact*i;
			
}
		return fact;
		//System.out.println("The factorial of " +n+"  is  "+fact);
		
}
}