package Gopikrishnan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        m = s.nextInt();
        int temp=m;
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        if(temp==sum) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("not palindrome");
        }
        //System.out.println("enterd: "+temp);
        //System.out.println("reverse: "+sum);
	}

}
