package Gopikrishnan;

import java.util.Scanner;
//other files:Contractor.java,Abstractemp_app.java,Fulltime_abstract.java

public class Contractor extends Abstractemployee_parent{

	@Override
	public int calculatesalary(int pay,int hr) {
		// TODO Auto-generated method stub
		System.out.println("contract time employee payment");
		int calc=pay*hr;
		return calc;
		
	}

	

}
