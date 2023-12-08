//Program to demonstrate on: 
//this keyword can be passed as argument inside method call
package org.tnsif.thiskeyworddemo;

class Director{
	String movieName;
	
	void print()
	{
		this.movieName="Super 30";
		display(movieName);
	}
	void display(String movieName)
	{
		System.out.println("Movie name is: "+movieName);
	}
}

public class ThisKeywordDemo4 {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();

	}

}
