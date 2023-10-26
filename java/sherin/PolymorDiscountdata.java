package sherin;
import java.util.*;
public class PolymorDiscountdata {
	int amt;
	public static void main(String args[])
	{

		System.out.println("Enter the amount ");
		Scanner reader=new Scanner (System.in);
		int amt=reader.nextInt();
	
		PolymorDiscount	disc;

			
		System.out.println("Enter the month of your puchase");
		String season= reader.next();
		if (season.equals("January")||season.equals("February")||season.equals("march"))
		{
			disc=new PolymorOffseason();
			disc.discount(amt);
		
			
	}
		else
		{

			disc=new PolymorOnseason();
			disc.discount(amt);
						
		}
		}

}

