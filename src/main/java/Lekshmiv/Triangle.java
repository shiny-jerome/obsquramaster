package Lekshmiv;
import java.util.Scanner;
public class Triangle {
	
	public static void main(String args[])


    {


      Scanner reader=new Scanner(System.in);

      System.out.println("Enter the base of triangle");

      int b=reader.nextInt();

      System.out.println("Enter the height of triangle");

      int h=reader.nextInt();
      int a=(b*h)/2;


      System.out.println("The area of triangle is: "+a);
   }

}
