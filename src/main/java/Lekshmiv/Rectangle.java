package Lekshmiv;

public class Rectangle implements Ishape
{
	public void draw()
	{
		System.out.println("rectangle draw");
	}
	public static void main(String args[])
	{
		Ishape r=new Rectangle();
		r.draw();
	}

}
