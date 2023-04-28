package sherin;
import java.util.*;

public class MethodAverage {
	public static void main(String args[])
	{
add(56,45,70);
 add(34.2f,42.3f,6.5f);
 area(5.2f);
 area(5,4);
 area(7);
}
	public static void add(int a, int b, int c)
	{
		int avg= (a+b+c)/3;
		System.out.println("The average of three numbers are "+avg);
		
	}

	
	public static  void add(float a, float b, float c)
	{
		 float avg= (a+b+c)/3;
		System.out.println("The average of three numbers are "+avg);
		
	}
	//area of circle 
	public static  void area(float  r )
		{
		float area=(3.14f*r*r);
		System.out.println("The area of a circle is "+area);
		
		}
	//area of a rectangle
	public static void area(int l,int b)
	{
	int area=l*b;
	System.out.println("The area of a recangle  "+area );
	}
	public static void area(int side)
	{
		int area=side*side;
		System.out.println("The area of a square "+area);
	
	
}
}
	