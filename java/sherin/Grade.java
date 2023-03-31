package sherin;
import java.util.*;
public class Grade {
	public static void main (String args[])
	{
		int mark;
		System.out.println("Enter the mark");
		Scanner grade=new Scanner (System.in);
		mark=grade.nextInt();
		if (mark<40 )
		
			System.out.println("Failed");
		else if(mark>=40 &&mark<=60)
			System.out.println("Grade D ");
					else if(mark>=61 &&mark<=70)
				System.out.println("Grade c ");
			
				else if(mark>=71 &&mark<=80)
					System.out.println("Grade B");
				else if(mark>=81 &&mark<=100)
					System.out.println("Grade A");
				


}
}