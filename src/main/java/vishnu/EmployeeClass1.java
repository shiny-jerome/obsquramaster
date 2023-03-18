package vishnu;
import java.util.Scanner;
public class EmployeeClass1 {
	
	int basicPay;
	int decuction;
	int bonusPay;
	
	public void getSalaryDetails() {
		
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter the basic pay:");
		basicPay=reader.nextInt();
		System.out.print("Enter deduction:");
		decuction=reader.nextInt();
		System.out.print("Enter bonus pay:");
		bonusPay=reader.nextInt();
	

	}

}
