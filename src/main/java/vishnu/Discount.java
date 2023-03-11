package vishnu;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the product prices:");
		System.out.print("1. ");
		int p1=reader.nextInt();
		System.out.print("2. ");
		int p2=reader.nextInt();
		System.out.print("3. ");
		int p3=reader.nextInt();
		System.out.print("4. ");
		int p4=reader.nextInt();
		System.out.print("5. ");
		int p5=reader.nextInt();
		int sum1=totalPrice(p1,p2,p3,p4,p5);
		checkDiscount(sum1);
		
	}
	public static int totalPrice(int a, int b, int c, int d, int e)
	{
		int sum=a+b+c+d+e;
		return sum;
	}
	public static void checkDiscount(int sum1)
	{
		if (sum1>=5000)
		{
			int total=5000-(sum1*20)/100;
			System.out.println("Eligible for the discount!\nTotal price is: "+total );
		}
		else
		{
			System.out.println("Not eligible for the discount!\nTotal price is: "+sum1);
		}
	}

}
