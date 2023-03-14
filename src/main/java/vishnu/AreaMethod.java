package vishnu;

public class AreaMethod {
	public void area(float a)
	{
		float area=3.14f*a*a;
		System.out.println("Area of circle= "+area);
	}
	public void area(int a,int b)
	{
		int area=a*b;
		System.out.println("Area of rectangle= "+area);
	}
	public void area(int a)
	{
		int area=a*a;
		System.out.println("Area of square= "+area);
	}
}
