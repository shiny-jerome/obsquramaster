package vishnu;
import java.util.Scanner;
public class OddEvenCount {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		
		int evenCount=0;
		int oddCount=0;
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even number count:"+evenCount);
		System.out.println("Odd number count:"+oddCount);

	}

}
