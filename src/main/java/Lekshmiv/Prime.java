package Lekshmiv;
import java.util.Scanner;
public class Prime {
	
	 public static void main(String args[])

     {
       
       
       Scanner reader=new Scanner(System.in);
       System.out.println("Enter a number");
        int a=reader.nextInt();
         int c=a/2;
         
         int p=0;

      for (int i=2;i<=c;i++)

         {

          if(a%i==0)

           {
              p=1;
             break;
           }

        }

     if(p!=1)

      {

       System.out.println("the number is prime");

      }
     else
     {
     System.out.println("the number is not prime");
    
      }


}

}
