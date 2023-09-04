package Lekshmiv;



/*27. Write a program to check whether the customer have discount (get 20% discount if total amount 
is greater than 5000) or not and get the final amount in main method. (static methods)
 Get prices of items using parameterized method
 Method 1 - Calculate total amount
 Method 2 - Check discount*/
 
import java.util.*;
class Discount
  
 {
   static float total,dis;

   public static void total(float a,float b,float c)

    {

      total=a+b+c;
       
     }
   public static float discount()
     
     {

        if(total>5000)

       {

            dis=(total/100)*20;

            return dis;

       }
    else
          return total;
     
      
    }
   public static void main(String[] args)

    {
       Scanner reader=new Scanner(System.in);
      
       System.out.println("Enter 3 items its prices");

       String a1 =reader.nextLine();
       String b1 =reader.nextLine();
       String c1 =reader.nextLine();
       float x=reader.nextFloat();
       float y=reader.nextFloat();
       float z=reader.nextFloat();
       //System.out.println("The purchased items" +a1);
       //System.out.println("The purchased items" +b1);
       //System.out.println("The purchased items" +c1);
       total(x,y,z);
       float s=discount();
       
       System.out.println("The final amount is" +s);
      
   }
       

}
       

       