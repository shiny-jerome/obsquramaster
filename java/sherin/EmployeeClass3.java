package sherin;

public class EmployeeClass3 
{
	
public void   finalsalary(EmployeeClass1 obj1)
{

	float totalsalary=obj1.basic+obj1.hra+obj1.pf-obj1.deduct+obj1.bonus;

	System.out.println("SALARY SLIP");
	System.out.println("BASIC PAY "+obj1.basic);
	System.out.println("DEDUCTION"+obj1.deduct);
	System.out.println("BONUS"+obj1.bonus);
	System.out.println("HRA"+obj1.hra);
	System.out.println("PF"+obj1.pf);
	System.out.println("TOTAL"+totalsalary);
	
}
}