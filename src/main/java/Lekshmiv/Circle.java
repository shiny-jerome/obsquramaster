package Lekshmiv;

public class Circle implements Ishape {
	public void draw()
	{
		System.out.println("circle draw");
	}
	public static void main(String args[])
	{
		Ishape r=new Circle();
		r.draw();
	}


}
