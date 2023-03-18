package vishnu;

public class DiscountParameterized {
	int sum=0;
	
	public DiscountParameterized(int amt[])
	{
		for (int price:amt)
		{
			sum=sum+price;
		}	
	}
	
	public void checkDiscount()
	{
	if (sum>=5000)
	{
		int totalPrice=sum-sum*20/100;
		System.out.println("You are eligible for the discount!\nFinal amount: "+totalPrice);
	}
	else
	{
		System.out.println("You are not eligible for the discount!\nFinal amount: "+sum);
	}
	}

}
