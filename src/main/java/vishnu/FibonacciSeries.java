package vishnu;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter no.of terms to print");
		int n=reader.nextInt();
		
		int firstTerm=0;
		int secondTerm=1;
		
		for (int i=1;i<=n;i++)
		{
			System.out.println(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		

	}

}
