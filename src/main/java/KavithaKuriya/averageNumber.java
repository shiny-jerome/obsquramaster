package KavithaKuriya;

import java.util.Scanner;

public class averageNumber {
	
	public static int avg(int a,int b,int c)
	{
	    int sum=(a+b+c)/3;
	    System.out.println("The avergae of the three interger number is"+sum);
		return sum;
	}
	public static float avg(float a1,float b1,float c1)
	{
	    float sum= (a1+b1+c1)/3;
	    System.out.println("The avergae of the three interger number is"+sum);
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the  three interger number ");
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		avg(a,b,c);
		System.out.println("Enter the  three float number ");
		float a1=reader.nextFloat();
		float b1=reader.nextFloat();
		float c1=reader.nextFloat();
		avg(a1,b1,c1);
		
		
	}

}
