package sreeparvathy;

import java.util.Scanner;

public class GradeOfStudent {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first subject marks");
		int m1=reader.nextInt();
		System.out.println("Enter second subject marks");
		int m2=reader.nextInt();
		System.out.println("Enter third subject marks");
		int m3=reader.nextInt();
		int tot=m1+m2+m3;
		System.out.println(" Total marks="+ tot);
		int avg=tot/3;
		System.out.println(" Average= "+avg);
		if(avg>81 && avg<=100)
			{
				System.out.println("A Grade");
			}
		else if(avg>71 && avg<=80)
			{
				System.out.println(" B Grade");
			}
		else if(avg>61 && avg<=70)
			{
				System.out.println(" C Grade");
			}
		else if(avg>51 && avg<=60)
			{
				System.out.println(" C Grade");
			}
		else if(avg>41 && avg<=50)
			{
				System.out.println(" D Grade");
			}
		else
			{
				System.out.println("Failed");
			}
		
	}

}
