package Lekshmiv;

/*31. Write a program to find the Area of figures
a) Circle (pi*r*r)
b) Rectangle(l*b)
c) Square(a*a)
 Prompt the user to select the options(a/b/c) from command prompt.
 Get the inputs that needs to find area.*/

import java.util.Scanner;
class AreaFig
{


   AreaFig(double a,float b)
    {

      double f=a*b;
      System.out.println("Area of the circle is: "+f);
     }

 
   AreaFig(int a,int b)
    {

      int f=a*b;
      System.out.println("Area of the circle is: "+f);
     }
   AreaFig(int a)
    {

      int f=a*a;
      System.out.println("Area of the circle is: "+f);
     }

public static void main(String args[])

  {
    char c;

  do
     {
        
        System.out.println("Select an option to find the area of the figure");
        System.out.println();
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        Scanner reader=new Scanner(System.in);
        int a=reader.nextInt();
        switch(a)
        {
         case 1:
         AreaFig a1=new AreaFig(3.14,5);
         break;

         case 2:
         AreaFig a2=new AreaFig(6,5);
         break;
         
         case 3:
         AreaFig a3=new AreaFig(4);
         break;
       }
    System.out.println("Do you want to continue(y/n)");
    c=reader.next().charAt(0);
    }
    while(c=='y');
  }
}
