package Gopikrishnan;

public class Constructor_student_mark {
	int mark1,mark2,mark3;
	public Constructor_student_mark(int m1,int m2,int m3) {
		mark1=m1;
		mark2=m2;
		mark3=m3;
		
		
	}

	public void calculateTotal() {
		int total=mark1+mark2+mark3;
		System.out.println(total);
		if(total>=40) {
			System.out.println("A GRADE");
		}
		else if (total>=30) {
			System.out.println("B GRADE");
		}
		else if (total>20) {
			System.out.println("C GRADE");
		}
		else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_student_mark c1=new Constructor_student_mark(10,5,10);
		c1.calculateTotal();
		Constructor_student_mark c2=new Constructor_student_mark(30,5,10);
		c2.calculateTotal();
		
	}

}
