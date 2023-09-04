/*34. Program to find the reverse of a number
 Two constructors, one for calculation reverse and other for display “Finding reverse…”
 Argument variable and instance variable should be same
 Main method allows to invoke only one constructor */

package Lekshmiv;

import java.util.Scanner;

public class ConstructorReverse {
	int rev;
	int r=0;
	
	ConstructorReverse()
	 { 
		System.out.println("Finding reverse");
		
	}
	ConstructorReverse(int rev)
	{
	this();
	 this.rev=rev;
	 
	 while(this.rev!=0)
	 {
		 int p=this.rev%10;
		 r=(r*10)+p;
		 this.rev=this.rev/10;
		
	}
	 System.out.println(r);
	 
	 }
	public static void main(String args[])
	{
		
		System.out.println("Enter a number to be reversed");
		Scanner reader=new Scanner(System.in);
		int s=reader.nextInt();
		ConstructorReverse reverse=new ConstructorReverse(s);
		
	}
	}
	 
	
	
