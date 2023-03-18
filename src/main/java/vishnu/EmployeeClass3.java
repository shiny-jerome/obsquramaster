package vishnu;

public class EmployeeClass3 {
	
	public void finalSalary(EmployeeClass1 obj1, EmployeeClass2 obj2) 
	{
		float finalSalary=obj1.basicPay+obj2.hra-obj2.pf-obj1.decuction+obj1.bonusPay;
		System.out.println(" ");
		System.out.println("SALARY SLIP\nBasic pay:"+obj1.basicPay+"\nDeduction:"+obj1.decuction+"\nHRA:"+obj2.hra+"\nPF:"+obj2.pf+"\nBonus:"+obj1.bonusPay+"\nTotal Salary:"+finalSalary);
	}

}
