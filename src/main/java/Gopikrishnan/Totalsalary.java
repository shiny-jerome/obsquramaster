package Gopikrishnan;

public class Totalsalary {

	public void salary(Employee emp) {
		
		System.out.println("**********************");
		System.out.println("Basic Pay: "+emp.basicpay);
		System.out.println("Deduction"+ emp.deduction);
		System.out.println("HRA: "+emp.hra);
		System.out.println("pf: "+emp.pf);
		int totalsal=emp.basicpay+emp.hra-emp.deduction-emp.pf;
		System.out.println("Toal salary= "+totalsal);
		System.out.println("**********************");
	}

}
