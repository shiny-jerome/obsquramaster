package vishnu;

public class EmployeeClassMain {

	public static void main(String[] args) {
		EmployeeClass1 obj1=new EmployeeClass1();
		obj1.getSalaryDetails();
	
		EmployeeClass2 obj2=new EmployeeClass2();
		obj2.calculateHra(obj1);
		obj2.calculatePf(obj1);
		
		EmployeeClass3 obj3=new EmployeeClass3();
		obj3.finalSalary(obj1, obj2);
		
	}

}
