package sherin;
import java.util.*;
public class AbstractEmployeeDetails {
	public static void main(String[] args) {
		
		
		System.out.println("Choose the Employee type \n 1: Contractor Employee\n 2:Full time Employee");
		Scanner reader=new Scanner (System.in);
	int choice=reader.nextInt();
	if (choice==1)
	{		
		AbstractEmployee  aemp=new AbsContractorEmployee();
	
		System.out.println("The salary of Contractor Employee"+aemp.calculateSalary());
	}
	if (choice==2)
	{
		AbstractEmployee aemp=new AbsFulltimeEmployee();
		System.out.println("The salary of Full time employee"+aemp.calculateSalary());
		
	}
	
	}
}
