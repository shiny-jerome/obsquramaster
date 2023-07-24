package Lekshmiv;

public class Count {
	
	public static void main(String args[])

	{

	int i;
	int e=0;
	int o=0;

	for(i=1;i<=20;i++)

	   {
	     if(i%2==0)
	      {
	       e++;
	      }
	 else
	     {

	      o++;

	     }
	}

	System.out.println("Number of odd numbers" +o);
	System.out.println("Number of even numbers" +e);




	}

}
