package sherin;
import java.util.*;
public class AmountMain {
	
	public static  void main(String Args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter number of items");
	int num=reader.nextInt();
	int price[]=new int[num];
	System.out.println("Enter the price of items");
	for(int i=0;i<num;i++)

	{
		price[i]=reader.nextInt();
		
	}
	AmoutParameter obj=new AmoutParameter(price);
	obj.discount();
}
}
