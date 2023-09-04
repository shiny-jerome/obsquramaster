package Lekshmiv;

public class SalaryClass3 extends SalaryClass2 {
	
	int total;
	public void total()
	
	{
		
		total=bpay+hra+bonus-pf-ded;
		
	}
	
	public static void main(String args[])
	
	{
		SalaryClass3 s=new SalaryClass3();
		s.calculate();
		s.total();
		System.out.println("***Salary slip***");
		System.out.println("Basic pay: "+s.bpay);
		System.out.println("Hra: "+s.hra);
		System.out.println("PF :"+s.pf);
		System.out.println("Bonus: "+s.bonus);
		System.out.println("Deduction: "+s.ded);
		System.out.println("Total salary in hand: "+s.total);
		
		
	}
	}
	

	

