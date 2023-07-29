package Lekshmiv;
import java.util.Scanner;
public class Fibonacci {
	
	public static void main(String args[])

    {
      int k=0,j=1,s;

     System.out.println("Enter a limit");
     Scanner reader=new Scanner(System.in);
     int n=reader.nextInt();
       
       
for(int i=1;i<=n;i++)

  {

   System.out.println(k);
   
    s=k+j;
    k=j;
    j=s;


      
     
    }

 }


}
