package sherin;
import java.util.*;

public class ConstructArea 
{
	double r,area1;
	int l,b,a,area2,area3;
	
	
	public static void main(String args[])
	{

		char opt;
		Scanner reader=new Scanner(System.in) ;
		
		do
		{
		System.out.println("Select the options\n a.Area of a circle \n b.Areaof a rectangle \n c.Area of a Square");
		System.out.println("Enter the choice");
		char ch= reader.next().charAt(0);
		
		switch ( ch)
		{
		
		case 'a':
		System.out.println("Enter the radius of a circle ");
		double r=reader.nextDouble();
		ConsAreas s1=new ConsAreas( r);
		break;
		case 'b':
		System.out.println("Enter the length of a recatngle ");
		int l=reader.nextInt();
		System.out.println("Enter the breadth of a recatngle ");
		int b=reader.nextInt();
		ConsAreas s2=new ConsAreas(l, b);
		break;
		
		case 'c':
		System.out.println("Enter the side of a Square  ");
		int a=reader.nextInt();
		ConsAreas s3=new ConsAreas( a);
		break;
		}
		System.out.println("Do you what to continue?" );
		 opt =reader.next().charAt(0);
			}
		while( opt=='y'||opt=='Y');
				
	}
	}
		
		
		
		
