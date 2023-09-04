/*
 38. Program to calculate discount
If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
 Should use two classes, Onseason and Offseason
 Use two methods- discount(method name should be same)
 */

package Lekshmiv;

public class OnSeason extends OffSeason {
	int disc;
	int price=4000;
	
public void discount()
	{
	disc=(4000*40)/100;
	System.out.println("Didcount smount for onseason: "+disc);
	}
public static void main(String args[])
{
	OffSeason on=new OnSeason();
	on.discount();
}
}
