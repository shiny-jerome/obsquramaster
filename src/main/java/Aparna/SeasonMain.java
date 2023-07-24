package Aparna;

import java.util.Scanner;

import vishnu.OffSeason;
import vishnu.OnSeason;
import vishnu.Season;

public class SeasonMain {

	public static void main(String[] args)
	{

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
		else if(month.equals("october")||month.equals("November")||month.equals("December"))
		{
			season=new OffSeason();
			season.discount(amount);
		}
		else
		{
			System.out.println("no Discount");
			Season season1=new Season();
			season1.discount(5000);
			
		}

	}

}
