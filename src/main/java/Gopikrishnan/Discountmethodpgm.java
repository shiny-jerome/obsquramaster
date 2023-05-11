package Gopikrishnan;
import java.util.Scanner;

public class Discountmethodpgm {
	Scanner sc =new Scanner(System.in);
	static int total=0;//instance var declare
	static int discountt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discountmethodpgm d=new Discountmethodpgm();
		int calc=calculation(3000,2000);//calling total function , calc is used to store the out of the method
		if(calc>5000) {
		d.discount(calc);//calling discount function(calc) is the parameterised value, it is for int totals in discount function.
		
		}
		else {
			System.out.println("your amount is "+calc);
			System.out.println("your amount is less than 5000, no discount");
		}
		}
	
	
	static int calculation(int num1,int num2) {
		 total=num1+num2;
		

		return total;
		
	}
	
	public int discount(int totals) {
		int per=(totals/100);
		int discountt=per*20;
		System.out.println("your discount is "+discountt);
		int rest=total-discountt;
		System.out.println("your total amount is "+rest);

		return discountt;
		
	}
	}



