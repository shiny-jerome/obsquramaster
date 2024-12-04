package sreeparvathy;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float l,b;
		Scanner reader=new Scanner(System.in); 
		System.out.println("Enter length");
		float len=reader.nextFloat();
		System.out.println("Enter breadth");
		float bre=reader.nextFloat();
		float area=(len*bre)/2;
		System.out.println("Area of Triangle="+area);
	
	}

}
