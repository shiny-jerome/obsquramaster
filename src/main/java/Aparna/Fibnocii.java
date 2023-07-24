package Aparna;

public class Fibnocii {

	public static void main(String[] args) 
	{
		int f=1,s=1,n=10,t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=n;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}

	}

}
