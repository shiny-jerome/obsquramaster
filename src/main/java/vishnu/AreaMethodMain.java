package vishnu;
import java.util.Scanner;
public class AreaMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("Calculate area of:\na. Circle \nb. Rectangle \nc. Square");
			char option=reader.next().charAt(0);
			
			switch (option)
			{
			case 'a':
				System.out.println("Enter the radius of the circle");
				float radius=reader.nextFloat();
				AreaMethod obj1=new AreaMethod();
				obj1.area(radius);
				break;
			case 'b':
				System.out.println("Enter length and breadth of the rectangle");
				int l=reader.nextInt();
				int b=reader.nextInt();
				AreaMethod obj2=new AreaMethod();
				obj2.area(l, b);
				break;
			case 'c':
				System.out.println("Enter length of the square");
				int length=reader.nextInt();
				AreaMethod obj3=new AreaMethod();
				obj3.area(length);
				break;
			}
			System.out.println("Do you with to continue?\npress 'y' for yes and 'n' for no");
			ch=reader.next().charAt(0);
		}
		while(ch=='y');

	}

}
