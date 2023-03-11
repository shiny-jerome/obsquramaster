package vishnu;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is Armstrong or not");
		int number=reader.nextInt();
		int temp=number;
		int sum=0;
		
		while(number>0)
		{
			int remainder=number%10;
			sum=sum+remainder*remainder*remainder;
			number=number/10;
		}
		if (temp==sum)
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}

	}

}
