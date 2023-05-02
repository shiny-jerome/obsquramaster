package Aparna;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the Mark");
		int mark=reader.nextInt();
        if(mark<=40)
      {
	System.out.println("Failed");
      }
        else if(mark<=60&&mark>=40)
        {
        	System.out.println("Grade D");
        }
        else if(mark<=70&&mark>=61)
        {
        	System.out.println("Grade c");
        }
        else if(mark<=80&&mark>=72)
        {
        	System.out.println("Grade B");
        }
        else if(mark<=100&&mark>=81)
        {
        	System.out.println("Grade A");
        }
        else
        {
        	System.out.println("Invalid Marks");
        }
 
	}

}
