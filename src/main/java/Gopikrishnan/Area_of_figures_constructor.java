package Gopikrishnan;
import java.util.Scanner;
public class Area_of_figures_constructor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c="";
		// TODO Auto-generated method stub
		
		
		System.out.println("1.Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Square");
		do {
			System.out.println("Select options");
		
		int option=sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Enter radius");
			float input=sc.nextFloat();
			Area_of_figures_constructor a1=new Area_of_figures_constructor(input);
			break;
		case 2:
			System.out.println("Enter breadth");
			float input1=sc.nextFloat();
			System.out.println("Enter height");
			float input2=sc.nextFloat();
			Area_of_figures_constructor a2=new Area_of_figures_constructor(input1,input2);
			break;
		case 3:
			System.out.println("enter length of one side");
			int input4=sc.nextInt();
			Area_of_figures_constructor a3=new Area_of_figures_constructor(input4);
			
		default:
			System.out.println("invalid");
			break;
		}
		System.out.println("Do you want to continue? y/n");// yes or no
		c=sc.next();// for y/n
		}while(c.equalsIgnoreCase("Y"));

	}
	public  Area_of_figures_constructor(float r) {
		//float pi=;
		
		float square=r*r;
		float result=3.14f*square;
		System.out.println(result);
	}
	public Area_of_figures_constructor(float b,float h) {
		
		float result=(b*h)/2;
		System.out.println(result);
	}
	public Area_of_figures_constructor(int a) {
		
		int result=a*a;
		System.out.println(result);
	}


}
