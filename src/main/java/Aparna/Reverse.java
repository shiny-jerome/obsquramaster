package Aparna;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number");
	int num=sc.nextInt();//1234
	//using algorithm
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
		
	}
	System.out.println("the reverse number is:"+rev);

	}
}
	
	
	//using String Buffer class
	
	/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println("The reverse num is:"+rev);*/
	
	
	
	
	//using String Builder class
	
	/*StringBuilder sb1=new StringBuilder();
	sb1.append(num);
	StringBuilder rev=sb1.reverse();
	System.out.println("the reverse is:"+rev);*/
	

