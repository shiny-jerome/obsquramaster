package Gopikrishnan;

public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4,5},{6,7,8,9},{11,12}};
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		
		}

	}
	

}
