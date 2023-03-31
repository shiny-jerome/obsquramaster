package sherin;
import java.util.*;

public class EmployeeMain {
	public static void main(String args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the salary details pf an Employees");
	EmployeeClass1 obj1=new EmployeeClass1();
	obj1.salary();
	EmployeeClass2 obj2=new EmployeeClass2();
	obj1.hra=obj2.Calculatehra(obj1.basic);
	obj1.pf=obj2.Calculatepf(obj1.basic);
	
	EmployeeClass3 obj3=new EmployeeClass3();
	obj3.finalsalary(obj1);

	}

}
