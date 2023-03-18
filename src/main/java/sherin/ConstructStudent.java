package sherin;

public class ConstructStudent {
	
String grade;
	public ConstructStudent( int m1,int m2,int m3)
	
			{
		int total =m1+m2+m3;
		
		if  (total>80)
		{
			grade="A";
		}
		else if (total>60&&total<80)
		{
			grade="B";
					}
		else if (total>50 && total<60 )
			grade="c";
		else if (total>40 && total<50 )
			grade="D";
		else
			grade="Failed";
			
}
}
