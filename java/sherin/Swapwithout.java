package sherin;

import java.util.*;

public class Swapwithout {
	
	public static void main (String args[])
	{
	int a,b;
	Scanner swap=new Scanner(System.in);
	System.out.println("Enter the values a and b");
	a=swap.nextInt();
	b=swap.nextInt();
	System.out.println("--Before swap--");
	System.out.println("First number = " + a);
	System.out.println("Second number = " +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("--After swap--");
	System.out.println("First number = " + a);
	System.out.println("Second number = " +b);
	}
	}


