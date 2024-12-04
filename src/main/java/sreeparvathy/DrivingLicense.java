package sreeparvathy;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter age");
		int age=reader.nextInt();
			if(age>=18)
					{
								System.out.println("Eligible for driving license");
					}
			else
					{
								System.out.println("Not eligible for driving license");
					}
					
			
		}

}
