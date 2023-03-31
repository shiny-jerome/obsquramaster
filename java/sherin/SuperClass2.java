package sherin;
import java.util.*;
public class SuperClass2 extends SuperClass1{
	void check(int a,int b)
	{
		int sum=super.add(a, b);
				
		if (sum%10==0)
	{
		System.out.println("The sum is divisible by 10");
	}
	else
	{
		System.out.println("The sum is not divisible by 10");
	}
	}

	public static void main(String args[])
	{
		System.out.println("Enter the numbers");
	Scanner reader=new Scanner (System.in);
	int a=reader.nextInt();
	int b=reader.nextInt();
	  SuperClass2 sc=new SuperClass2();
	  sc.check(a, b);
	}
}
