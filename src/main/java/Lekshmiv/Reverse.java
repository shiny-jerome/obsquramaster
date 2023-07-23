package Lekshmiv;
import java.util.Scanner;

public class Reverse {
	
	 public static void main(String args[])


	   {
	    
	   int r=0,c;
	   System.out.println("Enter the number");

	   Scanner reader=new Scanner(System.in);
	   int a=reader.nextInt();

	 while(a!=0)

	 {
	   c=a%10;
	   r=(r*10)+c;
	   a=a/10;
	 }
	   
	 System.out.println("The reverse number is: "+r);

	   }

}
