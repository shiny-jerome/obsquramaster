package vishnu;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=reader.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The numeber is Even");
		}
		else
		{
			System.out.println("The number is Odd");
		}

	}

}
