package sherin;

public class PolymorOffseason extends PolymorDiscount{
	public void discount(int amt)
	{
		int price=amt-(amt*15)/100;
		System.out.println("The final price is  "+price);
		
	}
	}


