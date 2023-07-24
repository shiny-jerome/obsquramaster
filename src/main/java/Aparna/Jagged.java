package Aparna;

public class Jagged {

	public static void main(String[] args) 
	{
		int a[][]= {{2,3,5},{3,5,7,8},{6,7}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
