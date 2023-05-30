package Gopikrishnan;

import java.util.Scanner;
//other files:Contractor.java,Abstractemp_app.java,Fulltime_abstract.java
public class Abstractemp_app {
	public static void main(String[] args) {
		int hrinput;
		int payinput;
		int option;
		int defaulthr=8;
		Scanner sc=new Scanner(System.in);
		System.out.println("select option");
		System.out.println("1. Contract");
		System.out.println("2.Fulltime");
		System.out.println("please enter your choice:");
		option =sc.nextInt();
		Abstractemployee_parent app;//parent refference
		switch (option) {
		case 1:
			System.out.println("you have selected contract");
			System.out.println("enter hours");
			hrinput=sc.nextInt();
			System.out.println("enter pay per hour");
			payinput=sc.nextInt();
			app=new Contractor();
		System.out.println(app.calculatesalary(payinput, hrinput));	
			break;
		case 2:
			System.out.println("you have selected Fulltime");
			app=new Fulltime_abstract();
			System.out.println("enter pay per hour");
			payinput=sc.nextInt();
			System.out.println(app.calculatesalary(payinput, defaulthr));
			break;
			
		default:
			System.out.println("invalid");
			break;
		}
		
		
		
	}
}
