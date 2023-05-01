package Gopikrishnan;

public class Swappingwithvariable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		System.out.println("values before swapping a= "+a);
		System.out.println("values before swapping b= "+b);
		int c=a; // here var c is a temperory variable
		a=b;
		b=c;
		System.out.println("values after swapping a= "+a);
		System.out.println("values after swapping b= "+b);

	}

}
