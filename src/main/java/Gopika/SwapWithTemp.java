package Gopika;

import java.util.Scanner;

public class SwapWithTemp {
	public static void main (String args[]) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter  number a");
		int a = reader.nextInt();
		System.out.println("Enter  number b");
		int b =reader.nextInt();
		System.out.println("Numbers before swapping are a=" +a +"b=" +b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Numbers after swapping are a="+a+"b=" +b);
		
	}

}
