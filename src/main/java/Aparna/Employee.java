package Aparna;

import java.util.Scanner;

public class Employee
{
float basicpay,bonus,hra,deduction,pf;
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);

		 Employee emp=new Employee();
		 System.out.println("enter basic pay");
		 emp.basicpay=sc.nextFloat();
		 System.out.println("enter bonus");
		 emp.bonus=sc.nextFloat();
		 System.out.println("enter deduction");
		 emp.deduction=sc.nextFloat();

		 
		HraPf obj=new HraPf();
		emp.pf= obj.calculatepf(emp.basicpay);
		emp.hra=obj.calculatehra(emp.basicpay);
		
		TotalSalary obj1=new TotalSalary();
		obj1.salary(emp);
		 
	}

}
