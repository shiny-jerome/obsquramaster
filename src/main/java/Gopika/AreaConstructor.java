package Gopika;

import java.util.Scanner;

public class AreaConstructor {
	public AreaConstructor(int r,float carea)
	{
		int radius = r;
		carea = 3.14f*r*r;
		System.out.println("Area of circle:"+carea);
	}
	public AreaConstructor(int a)
	{
		int sarea = a*a;
		System.out.println("Area of square:"+sarea);
		
	}
	public AreaConstructor(int x,int y)
	{
		int rarea = x*y;
		System.out.println("Area of rectangle:"+rarea);
				
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int rad = reader.nextInt();
		float circlearea = 0;
		AreaConstructor obj = new AreaConstructor(rad,circlearea);
		System.out.println("Enter the side of square");
		int a1= reader.nextInt();
		AreaConstructor obj1 = new AreaConstructor(a1);
		System.out.println("Enter the sides of rectangle");
		int a2=reader.nextInt();
		int a3=reader.nextInt();
		AreaConstructor obj2 = new AreaConstructor(a2,a3);
		
		
		
	}
}
