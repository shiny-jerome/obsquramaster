package sherin;
import java.util.*;

public class InterHDFC implements InterRBI{
	
		public  double recdeposit(int amt,int term)
		{
			double matamt=amt; 
			for(int i=1;i<=term;i++)
			{
				matamt=matamt+matamt*interest;
		}
		return matamt;
	}

public static void main(String[] args) {
	System.out.println("Enter the  amount to be deposited");
	Scanner reader=new Scanner(System.in);
	int amt=reader.nextInt();
	System.out.println("Enter the number period of deposit");
	int term=reader.nextInt();
	InterRBI obj=new InterHDFC();
	double matamt=obj.recdeposit(amt, term);
	System.out.println("The total amount after "+ term+"years amounts to be "+matamt);
	
}
}