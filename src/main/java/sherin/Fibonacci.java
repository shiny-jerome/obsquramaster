package sherin;
import java.util.*;

public class Fibonacci {
	public static void main(String args[])
	{
	
	int i,n1=0,n2=1,n3,num;
	System.out.println("Enter the number of numbers  ");
	Scanner count=new Scanner(System.in);
	
	num =count.nextInt();
	System.out.println("The fibonaci series are ");
	System.out.println(n1+"\n"+n2);
	for (i=2;i<=num;i++)
	
	{
	n3=n1+n2;
	System.out.println(""+n3);
	
	n1=n2;
	n2=n3;

		}
}
}