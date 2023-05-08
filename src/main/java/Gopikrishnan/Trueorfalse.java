package Gopikrishnan;

import java.util.Scanner;

public class Trueorfalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String c="";
		do{
		    System.out.println("How much money do you want to have? ");
		   

		    System.out.println("Ok, here is yours $" );

		    System.out.println("Do you want to continue y or n");
		   c =sc.nextLine();

		}while(c.equalsIgnoreCase("Y"));
	}

}
