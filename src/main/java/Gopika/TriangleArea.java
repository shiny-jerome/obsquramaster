package Gopika;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter base");
		int base = reader.nextInt();
		System.out.println("Enter height");
		int height = reader.nextInt();
		float area =  1/2f* base*height;
		System.out.println("Area="+area);
	}

}
