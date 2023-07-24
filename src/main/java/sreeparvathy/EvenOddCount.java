package sreeparvathy;

public class EvenOddCount {

	public static void main(String[] args) {
		
		int oddcount=0,evencount=0;
		for(int i=10;i<=20;i++)
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
		System.out.println("Even count ="+evencount);
		System.out.println("Odd count="+oddcount);

	}

}
