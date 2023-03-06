package vishnu;
import java.util.Scanner;
public class DrivingLicense {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter age of the candidate");
		int age=reader.nextInt();
		
		
		if (age>=18)
		{
			System.out.println("Eligible for Driving License");
		}
		else
		{
			System.out.println("Not eligible for Driving License");
		}

	}

}
