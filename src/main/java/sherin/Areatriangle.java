package sherin;
import java.util.*;

public class Areatriangle {
	public static void main (String args[])
	{
		float base, height, area;
		Scanner input =new Scanner (System.in);
		System.out.println("Enter  the base of a triangle ");
		base=input.nextFloat();
		
		System.out.println("Enter the  height of a triangle ");
		height=input.nextFloat();
		area= base*height/2;
		System.out.println("Area of a triangle   " +area );
		
}
}