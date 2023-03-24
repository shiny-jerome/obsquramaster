package vishnu;
import java.util.Scanner;
public class AdditionClass2 extends AdditionClass1 {
	
	void divisibility(int a, int b)
	{
		int num=super.sum(a, b);
		if (num%10==0)
		{
			System.out.println("The sum is divisible by 10");
		}
		else
		{
			System.out.println("The sum is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		
		AdditionClass2 obj=new AdditionClass2();
		obj.divisibility(num1, num2);
	}
}
