package lekshmi;

import java.util.Scanner;
public class PalidromeMethod
 {
 
public int reverse(int x)
  {
    int k=0;
   while(x!=0)

    {
      int m=x%10;
      k=(k*10)+m;
      x=x/10;
    }
  System.out.println("Reverse: "+k);
  return k;
  }
public void pal(int p,int q)

 {
    if(p==q)
     {
        System.out.println("The number is palidrome");
    
     }
   else

   {

    System.out.println("The number is not palidrome");
    
   }

}

public static void main(String args[])

  {
     int a;

     System.out.println("Enter the number");
    
     Scanner reader=new Scanner(System.in);
     a=reader.nextInt();
      
     PalidromeMethod obj=new PalidromeMethod();
     
     int r=obj.reverse(a);
     obj.pal(r,a);
 }

}
