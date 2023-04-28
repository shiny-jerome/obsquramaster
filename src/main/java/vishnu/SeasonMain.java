package vishnu;
import java.util.Scanner;
public class SeasonMain {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the month of purchase");
		String month=reader.next();
		System.out.println("Enter the bill amount");
		int amount=reader.nextInt();
		Season season=new Season();
		
		if (month.equals("January") || month.equals("February") || month.equals("March"))
		{
			season=new OnSeason();
			season.discount(amount);
		}
		else
		{
			season=new OffSeason();
			season.discount(amount);
		}

	}

}
