//program to demonstrate final method
package org.tnsif.finalkeyword;

//Parent class
//Final class cannot be inherit from the child class

public class Laptop {
	
	final String processor = "Intel I5";
	
	final void display()
	{
		System.out.println("Processor: "+processor);
	}

}
