//program to demonstrate on:
//You can invoked or initiate current class constructor 
package org.tnsif.thiskeyworddemo;

class Team
{
	int size;
	Team()
	{
		//calling to parameterized constructor
		this(7);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("parameterized Constructor: "+size);
	}
}

public class ThisKeywordDemo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Team t1 = new Team();
		Team t2 = new Team(10);
		
	}

}
