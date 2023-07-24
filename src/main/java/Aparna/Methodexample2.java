package Aparna;

public class Methodexample2
{
int a=23;
int b=30;
static int s;
	public static void main(String[] args)
	{
		Methodexample2 obj=new Methodexample2();
        obj.add();
        Methodexample2 obj1=new Methodexample2();
        obj1.average();
         

	}
public int add()
{
	s=a+b;
	System.out.println(s);
	return s;
}
public void  average() 
{ 
	int avg=s/2;
	System.out.println(avg);
	
}
}
