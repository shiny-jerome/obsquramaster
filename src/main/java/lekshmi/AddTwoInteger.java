package lekshmi;
import java.util.Scanner;
public class AddTwoInteger {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the first num:");
		int a = reader.nextInt();
		System.out.println("Enter the second num:");
		int b = reader.nextInt();
		
		int sum= a+b;
			System.out.println("Sum of Two nos:" +sum);
		
			}

}
