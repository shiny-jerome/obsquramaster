package Lekshmiv;
import java.util.Scanner;
class LinearSearch

  {

   public static void main(String args[])

    {

     int a[]={1,4,5,7,8};
     int i,s,p=0;

     System .out.println("Entered array is");

     for(i=0;i<a.length;i++)

       {
          System.out.println(a[i]);
       }

   
    System .out.println("enter the element to be searched");

    Scanner reader=new Scanner(System.in);
    s=reader.nextInt();


     for(i=0;i<a.length;i++)

       {  
         if(a[i]==s)
         {
         p=1;
         }

       }
if(p==1)

   {

     System.out.println("Element found");

   }

else
{
 System.out.println("Element notfound");
}

 
}
}       
         


      

