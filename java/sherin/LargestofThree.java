package sherin;
import java.util.*;

public class LargestofThree {
	public static void main (String args[])
	{
		Scanner num=new Scanner(System.in);
		float a, b, c,t;
		System.out.println("Enter the three numbers\n");
		a=num.nextFloat();
		b=num.nextFloat();
		c=num.nextFloat();
		if (a>b && a>c)
			System.out.println("The number "+a+" is the largest number");
		else if (b>c && b>a)
			System.out.println("The number "+b+" is the largest number");
		else
		System.out.println("The number "+c+" is the largest number");

}
}