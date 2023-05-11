package Gopikrishnan;
import java.util.Scanner;

public class Averageofthreemethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 float nu,mbers");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		float f3=sc.nextFloat();
		avg(f1,f2,f3);
		System.out.println("enter 3 int nu,mbers");
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		int t3=sc.nextInt();
		avg(t1,t2,t3);
		
	}
	public static void avg(float a,float b,float c) {
		float n=(a+b+c)/3;
		System.out.println(n);;
	}
	public static void avg(int a,int b,int c) {
		int n=(a+b+c)/3;
		System.out.println(n);
	}

}
