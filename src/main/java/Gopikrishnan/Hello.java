package Gopikrishnan;

public class Hello {

	public static void main(String[] args) {
		System.out.println("hello widening and narrowing");
		// TODO Auto-generated method stub
		//widening type casting
		int a=10;
		float b=a;
		System.out.println(b);
		//narrowing
		//f kodukkunath float, double kodukkumpol d kodukkuka
		float q=99.55f; // must specify double or float
		int qq=(int)q;
		System.out.println(qq+"  narrowing success");
	}

}
