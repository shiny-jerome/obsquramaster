package vishnu;
import java.util.Scanner;
public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		
		System.out.println("Before swapping:"+num1+", "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Afetr swapping:"+num1+", "+num2);

	}

}
