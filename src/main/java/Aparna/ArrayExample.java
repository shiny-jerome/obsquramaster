package Aparna;

public class ArrayExample {

	public static void main(String[] args) 
	{
		int a[]= new int [5];
		a[0]=20;
		a[1]=30;
		a[2]=30;
		a[3]=7000;
		a[4]=30;
		
		
		/*for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}*/
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
