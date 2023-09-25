package Gopika;

import java.util.Scanner;

/*
  153=1*1*1 + 5*5*5 + 3*3*3 =153
  370 = 3*3*3 + 7*7*7 +0 these type of nos are called amstrong nos
 */
public class Amstrongno {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = reader.nextInt();
		int temp = n;
		int r,sum =0;
		
		while(n>0)
		{ 
		r = n%10;
		n = n/10;
				
		sum = sum +r*r*r;
		}
		if (temp==sum)
			System.out.println("Its an amstrong no");
		else
			System.out.println("Its not an amstrong no");
			
		
	}

}
