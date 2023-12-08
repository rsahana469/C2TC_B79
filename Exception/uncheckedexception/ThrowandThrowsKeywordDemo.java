package org.tnsif.uncheckedexception;
//Program to demonstrate on throw
public class ThrowandThrowsKeywordDemo {
	
	static void isEligible(int age, int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Person is eligible to donate the blood");
		}
		else
			//throws keyword is used to throw an exception explicitly
			throw new ArithmeticException("Criteria is not satisfied");
	}

	public static void main(String[] args) {
		try
		{
			isEligible(13,68);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
