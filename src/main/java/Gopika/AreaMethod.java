package Gopika;

import java.util.Scanner;
public class AreaMethod {
	public static void circle(float a,int r)
	{

	a= 3.14f * r*r;
	System.out.println("Area of circle:"+a);
	}
        public static void square(int s)
	{

	int a= s*s;
	System.out.println("Area of square:"+a);
	}
        public static void rectangle(int y,int z)
	{

	int a= y*z;
	System.out.println("Area of rectangle:"+a);
	}
	 public static void main(String args[])
	{
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter the radius of the circle:");
	int rad = reader.nextInt();
	float x=0;
	circle(x,rad); //here parameters used for passing can be any float and int var (no need to a and r) which are initialised in void main
        System.out.print("Enter the side of the square:");
        int s = reader.nextInt();
        square (s);
        System.out.print("Enter the sides of the rectangle:");
        int y = reader.nextInt();
        int z = reader.nextInt();
        rectangle (y,z);
	}
}