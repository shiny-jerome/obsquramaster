package Lekshmiv;

import java.util.Scanner;

public class LargestNo {
	
	public static void main(String args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	
	int a=reader.nextInt();
	int b=reader.nextInt();
	int c=reader.nextInt();
	
	   if (a>b)
    
               {
                 if(a>c)
                  {
	
	
                   System.out.println("The largest number is" +a);
                  }

                   else
                  {
                   
                 System.out.println("The largest number is" +c);
                 }
               }
             else

              {
                 if(b>c)
                  {
	
	
                   System.out.println("The largest number is" +b);
                  }

                   else
                  {
                   
                 System.out.println("The largest number is" +c);
                 }


              }


	
	}
}
