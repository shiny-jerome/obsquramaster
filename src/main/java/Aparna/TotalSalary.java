package Aparna;

public class TotalSalary 
{
public void salary(Employee emp)
{
	System.out.println("***************");
	System.out.println("Basic pay:"+emp.basicpay);
	System.out.println("Bonus:"+emp.bonus);
	System.out.println("Deduction:"+emp.deduction);
	System.out.println("HRA:"+emp.hra);
	System.out.println("PF:"+emp.pf);
	float totalsal=emp.basicpay+emp.hra-emp.pf-emp.deduction+emp.bonus;
	System.out.println("Total Salary="+totalsal);
	System.out.println("***************");
	
	
}
}
