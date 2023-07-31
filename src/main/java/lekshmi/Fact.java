package lekshmi;

import java.util.Scanner;
class Fact

 {

  public static void factorial()

   {
      int f=1;
      int i;
     Scanner reader=new Scanner(System.in);
     System.out.println("Enter the no");
    
     int a=reader.nextInt();
     
      for(i=1;i<=a;i++)

        {
         f=f*i;

        }
    System.out.println("The factorial of given number is"+f);

  }

public static void main(String args[])

    {

      factorial();

    }

}
  