package vishnu;
import java.util.Scanner;
public class FactorialUsingMethod {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=reader.nextInt();
		factorial(num);
	}
	public static void factorial(int num)
	{	
		int facto=1;
		for(int i=1;i<=num;i++) 
		{
		facto=facto*i;
		}
		System.out.println("Factorial= "+facto);
	}

}
