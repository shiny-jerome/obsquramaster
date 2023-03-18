package vishnu;

public class AreaConstructor {
	
	public AreaConstructor(float a)
	{
		float area=3.14f*a*a;
		System.out.println("Area of circle= "+area);
	}
	public AreaConstructor(int a, int b)
	{
		int area=a*b;
		System.out.println("Area of rectangle= "+area);
	}
	public AreaConstructor(int a)
	{
		int area=a*a;
		System.out.println("Area of square= "+area);
	}

}
