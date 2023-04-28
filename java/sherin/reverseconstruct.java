package sherin;

import java.util.Scanner;
import java.util.*;

public class reverseconstruct {
	public static void main(String args[]) {
		System.out.println("Enter the number \n");
		Scanner reverse = new Scanner(System.in);
		int num = reverse.nextInt();
		reverseconstruct obj=new reverseconstruct(num);
		
	//	public reverseconstruct() 
		//{
			//System.out.println("");
	}

	public reverseconstruct(int num) {
		int revnum = 0;
		while (num != 0) {
			int reminder = num % 10;
			revnum = revnum * 10 + reminder;
			num = num / 10;

		}
		System.out.println("The reverse number " + revnum);
	}


	
}
