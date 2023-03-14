package vishnu;
import java.util.Scanner;
public class DiscountParameterizedMain {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number of items purcahsed");
		int num=reader.nextInt();
		int price[]=new int[num];
		
		
		System.out.println("Enter the price for each item");
		for(int i=0;i<num;i++)
		{
			price[i]=reader.nextInt();
		}
		
		DiscountParameterized obj=new DiscountParameterized(price);
		obj.checkDiscount();

	}

}
