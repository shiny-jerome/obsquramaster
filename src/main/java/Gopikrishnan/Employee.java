package Gopikrishnan;

import java.util.Scanner;

public class Employee {
	int basicpay;
	int hra;
	int deduction;
	int pf;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Employee emp=new Employee();// current class object
System.out.println("Enter basic pay");
emp.basicpay=sc.nextInt();

System.out.println("enter hra");
emp.hra=sc.nextInt();

System.out.println("enter deduction");
emp.deduction=sc.nextInt();
//////////////////////////////////
Hrapf hp=new Hrapf();// object of Hrapf class
emp.pf=hp.calculatepf(emp.basicpay);//value assign from class Hrapf via return
emp.hra=hp.calculatehra(emp.basicpay);//
/////////////////////////////////////
Totalsalary ts=new Totalsalary();
ts.salary(emp);

	}

}

