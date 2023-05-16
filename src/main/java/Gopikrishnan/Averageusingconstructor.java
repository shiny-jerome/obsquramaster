package Gopikrishnan;

public class Averageusingconstructor {
int aa,bb,cc;
float f1,f2,f3;
	
	public Averageusingconstructor(int a, int b, int c) {
		aa=a;
		bb=b;
		cc=c;
		int sum=aa+bb+cc;
		int avg=sum/3;
		System.out.println(avg);
	}
	public Averageusingconstructor(float a1, float b2, float c3) {
		f1=a1;
		f2=b2;
		f3=c3;
		float sum=f1+f2+f3;
		float avg=sum/3;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Averageusingconstructor a1=new Averageusingconstructor(5,7,8);
		Averageusingconstructor a2=new Averageusingconstructor(5.5f,7.6f,8.2f);
	}
	

}
