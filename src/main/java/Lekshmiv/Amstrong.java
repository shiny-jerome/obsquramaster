package Lekshmiv;
import java.util.Scanner;
public class Amstrong {
	
	public static void main(String args[]){
		   
		   int m=0,t,c;

		    Scanner reader=new Scanner(System.in);
		    System.out.println("Enter a valid number");

		    int a=reader.nextInt();
		    int s=a;
		   while(a!=0)
		    {
		    c=a%10;
		    t=c*c*c;
		    m=t+m;
		    a=a/10;
		    }
		   
		 if (s==m)

		   { 
		    
		     System.out.println("The number is amstrong");

		    }

		else

		  {
		     System.out.println("The number is not amstrong");

		  }

		  

		 }

}
