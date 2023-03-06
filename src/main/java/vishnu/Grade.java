package vishnu;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter mark");
		int mark=reader.nextInt();
		
		if (mark<=100 & mark>=81)
		{
			System.out.println("A grade");
		}
		else if (mark<=80 & mark>=71)
		{
			System.out.println("B grade");
		}
		else if (mark<=70 & mark>=61)
		{
			System.out.println("C grade");
		}
		else if (mark<=60 & mark>=41)
		{
			System.out.println("D grade");
		}
		else if (mark<=40 & mark>=0)
		{
			System.out.println("Failed!");
		}
		else
		{
			System.out.println("Invalid mark");
		}
	}

}
