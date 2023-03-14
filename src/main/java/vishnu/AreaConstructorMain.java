package vishnu;
import java.util.Scanner;
public class AreaConstructorMain {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Calculate area of:\na. Circle \nb. Rectangle \nc. Square");
			char option=reader.next().charAt(0);
			switch (option)
			{
			case 'a':
				System.out.println("Enter the radius of the circle:");
				float radius=reader.nextFloat();
				AreaConstructor obj1=new AreaConstructor(radius);
				break;
			case 'b':
				System.out.println("Enter length and breadth of the rectangle:");
				int length=reader.nextInt();
				int breadth=reader.nextInt();
				AreaConstructor obj2=new AreaConstructor(length,breadth);
				break;
			case 'c':
				System.out.println("Enter the length of the square:");
				int side=reader.nextInt();
				AreaConstructor obj3=new AreaConstructor(side);
				break;
			}
			System.out.println("Do you with to continue?\npres 'y' for yes and 'n' for no");
			ch=reader.next().charAt(0);	
		}
		
		while (ch=='y');

	}

}
