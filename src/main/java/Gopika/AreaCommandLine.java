package Gopika;

import java.util.Scanner;

public class AreaCommandLine {
public static void main(String[] args) {
	float ca;
	int ra,sa;
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a/b/c:");
	String x =reader.next();
	String s1="a";
	String s2="b";
	String s3="c";
if (x.equals(s1))
{

System.out.println("Area of Circle");
System.out.println("Enter the radius of the circle:");
 int r = reader.nextInt();
 ca= 3.14f*r*r;
 System.out.println("Area:"+ca);
	
}
else if(x.equals(s2))
{
	System.out.println("Area of Rectangle");
	System.out.println("Enter the sides of the rectangle:");
	 int r1 = reader.nextInt();
	 int r2 = reader.nextInt();
	 ra = r1*r2;
	 System.out.println("Area:"+ra);
}
else if (x.equals(s3))
{
	System.out.println("Area of Square");
	System.out.println("Enter the side of the square:");
	 int s = reader.nextInt();
	 sa=s*s;
	 System.out.println("Area:"+sa);
}
else
{
	System.out.println("Invalid Choice");
}
}
}
