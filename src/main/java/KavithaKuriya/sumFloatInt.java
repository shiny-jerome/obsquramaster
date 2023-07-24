package KavithaKuriya;

import java.util.Scanner;

public class sumFloatInt {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter an integer number:");
		int num1 =reader.nextInt();
		System.out.println("Enter a float number:");
		float num2= reader.nextFloat();
		//narrowing
		 int sum =num1+(int)num2;
		//widening
		 System.out.println("the Sum of float and integer is : "+sum);
		
	}

}
