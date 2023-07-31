package KavithaKuriya;

public class addMatrix {
	
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{1,2,3},{2,3,4}};
		int b[][]={{1,2,3},{1,2,3},{2,3,4}};
		int rows =a.length;
		int cols =a[0].length;
		int sum[][] = new int[rows][cols];
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                 sum[i][j] = a[i][j] + b[i][j];
                 System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    } 
	
}