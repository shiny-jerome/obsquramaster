package vishnu;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=reader.nextInt();
		
		if(num>0)
		{
			System.out.println("The number is positive");
		}
		else if (num==0)
		{
			System.out.println("The number is neither negative noe positive");
		}
		else
		{
			System.out.println("The number is negative");
		}

	}

}
