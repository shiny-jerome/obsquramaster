package Lekshmiv;

public class AbstractSampleChild extends AbstractSample {
	
	public void sound()
	{
		System.out.println("Sound is different"); //abstract class implementation
	}
	public static void main(String args[])
	{
	AbstractSample ref=new AbstractSampleChild();
	ref.dogBreed();
	ref.sound();
	
	
	}

}
