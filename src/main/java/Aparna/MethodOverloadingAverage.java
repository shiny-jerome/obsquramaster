package Aparna;

public class MethodOverloadingAverage {

	public static void main(String[] args) 
	{
	
		average(10,70,10);
		average(2.5f,8.7f,6.4f);
		
	}
	
	public static int average(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println(avg);
		return avg;
		
	}
	public static float average(float a,float b,float c)
	{
		float avg1=(a+b+c)/3;
		System.out.println(avg1);
		return avg1;
		
	}


}

