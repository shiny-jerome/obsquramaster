package sherin;
import java.util.*;

public class ConstructTotalAmount {

	

	public static void main(String args[])
	{
	float amount=amount();
	discount(amount);
	}
	public static float amount( )
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the number of items ");
	int n=reader.nextInt();
	System.out.println("Enter the amount of items ");
	float sum=0;
	for (int i=0;i<n;i++)
	{
	sum=sum+reader.nextFloat();
	}
	return sum;
	}
	public static void discount ( float total ) 
	{
	if (total>5000)
	{
	float dis=(total*20)/100;
	System.out.println("The 20% discount is eligible ");
	System.out.println("The amount to be paid="+(total-dis));
	}
	else 
	{
	System.out.println("Discount is available for the amont greter than 5000");
	System.out.println("The amount to be paid"+total);
	}

}
}