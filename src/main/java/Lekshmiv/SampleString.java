package Lekshmiv;

public class SampleString {
	
	public static void main(String args[])
	{
		String s="hello";
		System.out.println(s+"world");
		System.out.println(s);
		System.out.println(s.charAt(1));
		System.out.println(s.concat("world"));
		System.out.println(s.contains("ll"));
		
		
		System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String s1[]=s.split("-");
        for(String i : s1)
        {
        	System.out.println(i);
        }
		
		
	}
	}


