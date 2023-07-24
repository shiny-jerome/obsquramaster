package sreeparvathy;

public class SwapWithoutTemp {

	public static void main(String[] args) {
	
		int a=2,b=5;
		System.out.println("Numbers before swapping: a= "+a);
		System.out.println("Numbers before swapping: b= "+b);
		a=a+b;   //a=7
		b=a-b;  // b=2
		a=a-b;   //a=5
		System.out.println("Numbers after swapping: a= "+a);
		System.out.println("Numbers after swapping: b= "+b);
	}

}
