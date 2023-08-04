package Lekshmiv;

/*28. Write a program to find the

b) Area of figures(circle, rectangle, square) by using three methods(should have same 
method name)*/
import java.util.Scanner;
class MethodArea
   
     {

       public static void area(float r)
        
        {

          double a=3.14*(r*r);

          System.out.println("Area of circle: "+a);

        }

  public static void area(int l,int w)
        
        {

          float a=l*w;

          System.out.println("Area of circle: "+a);

        }
 public static void area(int s)
        
        {

          float a=s*s;

          System.out.println("Area of circle: "+a);

        }

public static void main(String args[])
    {

       Scanner reader=new Scanner(System.in);
       System.out.println("Enter the radius of circle");
       float c=reader.nextFloat();
     
       System.out.println("Enter the width and length of rectangle");
       int x=reader.nextInt();
       int y=reader.nextInt();

       System.out.println("Enter the side square");
       int z=reader.nextInt();
       area(c);
       
       area(x,y);
       area(z);

    }

}
  


      