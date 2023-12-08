package org.tnsif.superkeyword;

class Building
{
	int floors=23;
	String name="Tamanna";
	
}
class Flat extends Building
{
	String name="Bothra";
	/* if parent class and child class variable name are same and if i want to access parent class variable 
	 * inside child class use super.variable name*/
	void print()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		f.print();

	}

}
