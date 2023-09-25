package Gopika;

import java.util.Scanner;

public class AbstractContractor extends AbstractEmployee {
public void calculateSalary(){
	int a=500;
Scanner reader =new Scanner(System.in);
System.out.println("Enter the working hours");
	int hour = reader.nextInt();
	int payment = a* hour;
	System.out.println("Payment of Contract Employee :"+payment);
	
}
public static void main(String args[]) 
{
	AbstractContractor obj1 = new AbstractContractor();
	obj1.calculateSalary();
}
}
