package org.tnsif.superkeyword;

class Google
{
	String ceo;

	public Google(String ceo) {
		//super();
		//this.ceo = ceo;
		System.out.println("default constructor:"+ceo);
	}
}

class Gmap extends Google
{
	String userid;

	public Gmap(String ceo, String userid) {
		//calling to parent class parameterized constructor
		super(ceo);
		this.userid = userid;
		System.out.println("userid:"+userid);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Gmap g=new Gmap("Sunder Pichai","SakshiR");

	}

}
