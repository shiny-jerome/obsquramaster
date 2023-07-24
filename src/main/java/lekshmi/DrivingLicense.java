package lekshmi;
import java.util.Scanner;
public class DrivingLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Age");
		int age =reader.nextInt();
		if(age>18)
		{
		System.out.println("Eligible");
		}
		else
		{
		System.out.println("Not Eligible");
		}
		}
		
	}


