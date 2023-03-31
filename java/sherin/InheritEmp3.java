package sherin;

import java.util.Scanner;

public class InheritEmp3 extends InheritEmp2 {
	public void   finalsalary()
	{

	float totalsalary=basic+hra+pf-deduct+bonus;

	System.out.println("SALARY SLIP");
	System.out.println("BASIC PAY "+basic);
	System.out.println("DEDUCTION"+deduct);
	System.out.println("BONUS"+bonus);
	System.out.println("HRA"+hra);
	System.out.println("PF"+pf);
	System.out.println("TOTAL"+totalsalary);
	
}


	public static void main(String args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the salary details pf an Employees");
	InheritEmp3 emp=new InheritEmp3();
	
	emp.salary();
	emp.hra=emp.Calculatehra(emp.basic);
	emp.pf=emp.Calculatepf(emp.basic);
	emp.finalsalary();
	
	}
}