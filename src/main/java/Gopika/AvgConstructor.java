package Gopika;

public class AvgConstructor {
	public AvgConstructor(int a, int b,int c)
	  {
	int s= a+b+c;
	int avg = s/3;
	System.out.println("Average:" +avg);

	   }
	public AvgConstructor(float x, float y,float z)
	  {

	float sum = x+y+z;
	float average = sum/3;
	System.out.println("Average:" +average);


	   }
	public static void main(String args[])
	{

	AvgConstructor a = new AvgConstructor(10,20,30);
	AvgConstructor a1 = new AvgConstructor(10.5f,20.5f,30.5f);

	  }
}
