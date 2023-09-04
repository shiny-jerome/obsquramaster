package lekshmi;
import java.util.Scanner;
public class Method2 {

	 String n;
     int a;

	

	  public static void setname()

	    {

	      String n;
	      int a;


	     System.out.println("Enter your name and age");
	     Scanner reader=new Scanner(System.in);
	     n=reader.nextLine();
	     a=reader.nextInt();
	     System.out.println(" name and age");
	     System.out.println(n);
	     System.out.println(a);

	     }

	 

	  public static void main(String args[])

	   {
	    
	    setname();

	   }

	     
	}
	   
