package vishnu;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		int num3=reader.nextInt();
		
		if(num1>num2 & num1>num3)
		{
			System.out.println("Largest number is: "+num1);
		}
		else if (num2>num1 & num2>num3)
		{
			System.out.println("Largest number is: "+num2);
		}
		else
		{
			System.out.println("Largest number is: "+num3);
		}
	}

}
