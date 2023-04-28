package sherin;
import java.util.*;

public class AbsContractorEmployee extends AbstractEmployee{
	public  int calculateSalary()
	{
		System.out.println("Enter the number of hours the contractor emplyees working ");
		Scanner reader=new Scanner (System.in);
		int hours=reader.nextInt();
		int salary=hours*100;
		return salary;
	}
	}


