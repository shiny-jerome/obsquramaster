package Lekshmiv;


/*28. Write a program to find the
a) Average of three integer numbers, three float numbers(should have same method name)*/

import java.util.Scanner;
class MethodOverloading
{
  public static void avg(int x,int y,int z)

   {

     int a;
    a=(x+y+z)/3;
    System.out.println("avg of 3 intiger numbers "+a);

   }

public static void avg(float x,float y,float z)

   {

     float a;
    a=(x+y+z)/3;
    System.out.println("avg of 3 float numbers "+a);

   }

public static void main(String args[])

 {

   System.out.println("Enter 3 intiger numbers");
   Scanner reader=new Scanner(System.in);
   int a=reader.nextInt();
   int b=reader.nextInt();
   int c=reader.nextInt();
   System.out.println("Enter 3 float numbers");
   float p=reader.nextFloat();
   float q=reader.nextFloat();
   float r=reader.nextFloat();
   avg(a,b,c);
   avg(p,q,r);
}

}

