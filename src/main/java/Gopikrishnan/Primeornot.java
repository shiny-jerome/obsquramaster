package Gopikrishnan;
import java.util.Scanner;


public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			}
			
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}

}
