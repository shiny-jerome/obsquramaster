package Gopikrishnan;
import java.util.Scanner;
public class Discount {
	static Scanner sc =new Scanner(System.in);
	static int total=0;//instance var declare for universal acess 
	static int discountt=0;// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount d=new Discount();
		
		if(calculation()>5000) {
			d.discount();
		}
		else {
			System.out.println("no discount, you amount is "+total);
		}
		}
	static int calculation() {
		System.out.println("How many items");
		int item=sc.nextInt();
		int itemstore[]=new int[item];
		System.out.println("Enter the Amounts: ");  
		for(int i=0; i<item; i++)  
		{  
		//reading array elements from the user   
		itemstore[i]=sc.nextInt();  
		} 
		
		// accessing array elements using the for loop  
		for (int i=0; i<itemstore.length; i++)   
		{  
		total=total+itemstore[i];// summing up each elements.
		}  
		System.out.println("total amount "+total);
		return total;
		}
	public int discount() {
		int per=(total/100);
		int discountt=per*20;
		System.out.println("your discount is "+discountt);
		int rest=total-discountt;
		System.out.println("your total amount is "+rest);

		return discountt;
		}
	}



