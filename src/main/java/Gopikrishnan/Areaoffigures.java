package Gopikrishnan;
import java.lang.Math.*;

public class Areaoffigures {

	public static void main(String[] args) {
		calc(5);
		calc(2.5f,3.0f);
		calc(5);
		// TODO Auto-generated method stub

	}
	static void calc(float r) {
		//float pi=;
		float square=r*r;
		float result=3.14f*square;
		System.out.println(result);
	}
	static void calc(float b,float h) {
		float result=(b*h)/2;
		System.out.println(result);
	}
	static void calc(int a) {
		int result=a*a;
		System.out.println(result);
	}

}
