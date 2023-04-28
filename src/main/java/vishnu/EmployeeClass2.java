package vishnu;

public class EmployeeClass2 {
	
	float hra;
	float pf;
	
	public void calculateHra(EmployeeClass1 obj)
	{
		hra=obj.basicPay*5/100;
	}
	
	public void calculatePf(EmployeeClass1 obj)
	{
		pf=obj.basicPay*20/100;
	}

}
