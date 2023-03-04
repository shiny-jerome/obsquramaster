package vishnu;
import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter base length");
		float b=reader.nextFloat();
		System.out.println("Enter height");
		float h=reader.nextFloat();
		
		float area=b*h/2;
		
		System.out.println("Area of the triangle="+area);

	}

}
