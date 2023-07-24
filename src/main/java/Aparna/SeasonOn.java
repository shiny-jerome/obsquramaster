package Aparna;

public class SeasonOn  extends Season
{

	public void discount(int amt)
	{
		int price=amt-(amt*40)/100;
		System.out.println("Final amount= "+price);
	}
}
