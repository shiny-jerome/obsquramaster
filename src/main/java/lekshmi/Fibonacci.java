package lekshmi;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner reader = new Scanner(System.in);
  int n,t1=0,t2=1;
  System.out.println("Enter No of Terms");
  n = reader.nextInt();
  System.out.println("terms of Fibonacci" +n);
  for(int i=1;i<=n;++i)
  {
	System.out.println(t1 +"");
	int sum= t1+t2;
	t1=t2;
	t2=sum;
  }
  }

}
