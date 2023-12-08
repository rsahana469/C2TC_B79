package org.tnsif.polymorphismdemo;

class Bollywood
{
	static String couple (String s1, String s2)
	{
		return s1+" loves "+s2;
	}
	static String couple(String s1, String s2, String s3)
	{
		return s1+" loves "+s2+" as well as "+s3;
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		System.out.println( Bollywood.couple("Salman ","Aishwarya"));
	    System.out.println(Bollywood.couple("Salman ","Aishwarya","Katrina"));
		

	}

}
