package Lekshmiv;


	import java.util.Scanner;
	public class Driving
	 {

	public static void main(String args[])

	  {

	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter your name and age");
	    String name=reader.nextLine();
	    int a=reader.nextInt();
	    
	    if(a<18)
	    {

	    System.out.println(name);
	     System.out.println("is not eligible for driving license");
	    }

	else

	  {

	System.out.println(name);
	     System.out.println("is eligible for driving license");

	  }

	}
	}

	    
	   


