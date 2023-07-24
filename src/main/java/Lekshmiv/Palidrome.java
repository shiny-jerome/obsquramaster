package Lekshmiv;
import java.util.Scanner;

public class Palidrome {
	public static void main(String args[])
	 

	  {
	  
	   int r=0,c,s;

	    Scanner reader=new Scanner(System.in);
	    
	System.out.println("Enter a valid number");
	 
	int a=reader.nextInt();
	s=a;

	while(a!=0)
	  
	 {
	  c=a%10;
	  r=(r*10)+c;
	  a=a/10;
	}

	if(s==r)

	 {
	   System.out.println("The number is palidrome");

	}

	else

	{
	   System.out.println("The number is not palidrome");

	}
	 
	}
	
}
