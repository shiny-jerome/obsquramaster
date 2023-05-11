package Gopikrishnan;

public class Addandsubtwofunctioninone {

	public static void main(String[] args) {
		Addandsubtwofunctioninone ad=new Addandsubtwofunctioninone();//object for class so that we can access user defined methods which are not declared as static.
		// TODO Auto-generated method stub
		int c=ad.add(10,20);
		ad.avg(c);
	}
	
	
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	
	public void avg(int num) {
		int average=num/2;
		System.out.println(average);
	}
	



	
}



