package Gopikrishnan;

public class Swappingwithouttempvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=200;
		System.out.println("values before swapping x= "+x);
		System.out.println("values before swapping y= "+y);
		System.out.println("..................................");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("values after swapping x = "+x);
		System.out.println("values after swapping y = "+y);
		
		
		

	}

}
