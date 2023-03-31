package sherin;
import java.util.Scanner;

public class Addintfloat {
	
	public static void main(String[] args)
	{
	Scanner reader=new Scanner (System.in);
	System.out.println("Enter first number  as integer ");
	int a;
	float b, sum;
	a =reader.nextInt();
	System.out.println("Enter Second number  as deciaml ");
	b=reader.nextFloat();
	sum = a+b;
	System.out.println("The sum of two numbers is " +sum);
	}
	}


