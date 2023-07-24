package Aparna;

public class MethodOverloadingArea {

	public static void main(String[] args)
	{
		area(3);
		area(2,4);
		area(4.2f);
		

	}

	public static void area(int r)
	{
		float c= (float)(3.14*r*r);
		System.out.println(c);
	}
	public static void area(int a,int b)
	{
		int rec=a*b;
		System.out.println(rec);
	}
	public static void area(float c)
	{
	float s=c*c;
		System.out.println(s);
	}
}
