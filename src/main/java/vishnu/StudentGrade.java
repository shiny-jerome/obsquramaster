package vishnu;

public class StudentGrade {
	
	public StudentGrade(int a)
	{
		if (a<=100 & a>=81)
		{
			System.out.println("A grade");
		}
		else if (a<=80 & a>=71)
		{
			System.out.println("B grade");
		}
		else if (a<=70 & a>=61)
		{
			System.out.println("C grade");
		}
		else if (a<=60 & a>=41)
		{
			System.out.println("D grade");
		}
		else if (a<=40 & a>=0)
		{
			System.out.println("Failed!");
		}
		else
		{
			System.out.println("Invalid mark");
		}
	}

}
