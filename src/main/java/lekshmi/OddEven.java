package lekshmi;

public class OddEven {

	public static void main(String[] args) {
				int oddcount=0,evencount=0;
		for(int i=1;i<=20;i++)
		{
		if(i%2==0)
		{
		evencount++;
		}
		else
		{
		oddcount++;
		}
		}
		System.out.println("Odd Count is:"+oddcount);
		System.out.println("Even Count is:"+evencount);
	}
}
		


