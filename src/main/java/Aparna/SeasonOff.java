package Aparna;

public class SeasonOff extends Season
{
	public void discount(int amt)
	{
		int price=amt-(amt*15)/100;
		System.out.println("Final amount= "+price);
	}
}
