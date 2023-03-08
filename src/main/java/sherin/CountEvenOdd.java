package sherin;
import java.util.*;

public class CountEvenOdd {
	
	public static void main(String args[])
	{
		System.out.println("The number of even and odd numbers   between 10 and 20");
		int i,even=0,odd=0;
		for( i=10;i<=20;i++)
		{
			if (i%2==0) {
				++even;
			}
			else 
			{
				++odd;
			}
		}
		System.out.println("The number of even numbers are "+even);
		
		System.out.println("The number of odd numbers are"+odd);
	}

}
