package vishnu;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=reader.nextInt();
		boolean numprime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				numprime=false;
				break;
			}
		}
		if(numprime)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}

}
