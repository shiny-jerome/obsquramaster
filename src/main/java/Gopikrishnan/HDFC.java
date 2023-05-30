package Gopikrishnan;
import java.util.Scanner;
public class HDFC implements Irbi{
Scanner sc=new Scanner(System.in);


	
	
	

	public float reccuringdepo(float amnt, float drtn) {
		
		float interest=amnt*Irbi.rate;//Irbi.rate is used to access the variable from interface.
		float prf=interest*drtn;
		
		System.out.println("your yearly return is: "+prf); 
		System.out.println("your monthly return is: "+prf/12); 
		return prf;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj2=new HDFC();
		System.out.println("Enter amount");
		float amount=obj2.sc.nextFloat();
		System.out.println("Enter period");
		float period=obj2.sc.nextFloat();
		
		obj2.reccuringdepo(amount,period);

	}

}
