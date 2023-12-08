//Program to demonstrate Final keyword
package org.tnsif.finalkeyword;

public class FinalKeyword {
	
	//Final Variable must initialize during the declaration
	final float Salary = 45000.00f;
	
	void print()
	{
		System.out.println("Salary is: "+Salary);   //We can't change the value of final variable.
	}

}
