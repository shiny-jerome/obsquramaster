package KavithaKuriya;

public class oddOreven
{

  public static void main(String[] args) 
	{
	 int odd=0;
	 int even=0;
	 for(int i=1;i<=20;i++) 
	 {
		 if(i%2==0)
		 {
			 even++;
		 }else
		 {
			 odd++;
		 }
	 }
	 System.out.println("Odd is :"+odd);
	 System.out.println("Even is :"+even);
	}

}
