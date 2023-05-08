package Gopikrishnan;

public class Oddor {

	public static void main(String[] args) {
		int odds=0,even=0;// declaring two variables to store count of even and odd numbers
		// TODO Auto-generated method stub
		for(int i=10;i<=20;i++) {// numbers from 10 to 20 in a loop
			if(i%2==0) {//finding even using reminder
				even=even+1;//storing even counts
			}
			
		else
			{
				odds=odds+1;
			}
			
		}
		System.out.println("count of odd numbers: "+odds);
		System.out.println("count of even numbers: "+even);
		
	}
}
				
	