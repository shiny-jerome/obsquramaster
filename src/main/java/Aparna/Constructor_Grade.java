package Aparna;

public class Constructor_Grade 
{
int m1,m2,m3;
public Constructor_Grade(int Maths,int English,int Science)
{
m1=Maths;
m2=English;
m3=Science;
int total=m1+m2+m3;
System.out.println(total);
if(total>=250)
{
	System.out.println("Grade A");
}
else if(total>=200)
{
	System.out.println("Grade B");
}
else if(total>=150)
{
	System.out.println("Grade c");
}
else if(total>=100)
{
	System.out.println("Grade D");
}
else
{
	System.out.println("Failed");
}
}

	public static void main(String[] args)
	{
		Constructor_Grade obj=new Constructor_Grade(70,67,89);
		Constructor_Grade obj1=new Constructor_Grade(90,76,98);

	}

}
