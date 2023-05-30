package Gopikrishnan;
//other files:Contractor.java,Abstractemp_app.java,Fulltime_abstract.java
public class Fulltime_abstract extends Abstractemployee_parent {
	
	@Override
	public int calculatesalary(int pay,int hrs) {
		// TODO Auto-generated method stub
		System.out.println("fulltime employee payment");
		int calc=pay*8;
		return calc;
		
	}
}
