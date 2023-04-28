package sherin;
import java.util.*;
public class PolymorDiscountdata {
	
	public static void main(String args[])
	{
		PolymorDiscount disc;
		
		disc=new PolymorDiscount();
		disc.discount();
		
		
		disc=new  PolymorOffseason();
		disc.discount();
		
		
		disc=new PolymorOnseason();
		disc.discount();
		
		System.out.println("Enter the amount ");
		Scanner reader=new Scanner (System.in);
		float amount=reader.nextFloat();
		System.out.println("Enter the mont of your puchase");
		String season= reader.next();
		if (season.equals("January")||season.equals("February"))
		{
		 
	}

}
}
