package vishnu;
import java.util.Scanner;
public class FactorialMethodMain {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial");
		int num=reader.nextInt();
		
		FactorialMethod obj=new FactorialMethod();
		obj.calculation(num);
		obj.print();

	}

}
