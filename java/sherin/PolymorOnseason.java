package sherin;

public class PolymorOnseason extends PolymorDiscount {
	public void discount(int amt)
	{
		int price=amt-(amt*40)/100;
		System.out.println("The price after discount in on season "+price);
	}

}
