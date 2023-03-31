package sherin;

public class AmoutParameter {
	int sum=0;

	public AmoutParameter(int amt[])
	{
		for (int price:amt)
		{
			 sum=sum+price;
}		
		
}
	public  void discount()
	{
		if (sum>5000)
		{
			float dis=(sum*20)/100;
			System.out.println("The 20% discount is eligible ");
			System.out.println("The amount to be paid="+(sum-dis));
		}
		else 
		{
			System.out.println("Discount is available for the amont greter than 5000");
		System.out.println("The amount to be paid"+sum);
		}
		 
		}
	}
