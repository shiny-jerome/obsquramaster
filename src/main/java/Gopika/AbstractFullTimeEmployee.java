package Gopika;

public class AbstractFullTimeEmployee extends AbstractEmployee {
	public void calculateSalary()
	{
		int a=1000;
		int payment = a*8;
		System.out.println("Payment of full time Employee :"+payment);
	}
public static void main(String[] args) {
	AbstractFullTimeEmployee obj1= new AbstractFullTimeEmployee();
	obj1.calculateSalary();
}
}
