package vishnu;
import java.util.Scanner;
public class StudentGradeMain {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int numSubject=3;
		
		System.out.println("Enter the grades of Student 1:");
		int m1[]=new int[numSubject];
		int sum1=0;
		for(int i=0;i<numSubject;i++)
		{
			m1[i]=reader.nextInt();
			sum1=sum1+m1[i];
		}
		System.out.println("Grade of Student 1:");
		StudentGrade obj1=new StudentGrade(sum1);
		
		System.out.println("Enter the grades of Student 2:");
		int m2[]=new int[numSubject];
		int sum2=0;
		for(int i=0;i<numSubject;i++)
		{
			m2[i]=reader.nextInt();
			sum2=sum2+m2[i];
		}
		System.out.println("Grade of Student 2:");
		StudentGrade obj2=new StudentGrade(sum2);

	}

}
