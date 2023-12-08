package org.tnsif.customexception;
//Program to demonstrate on custom exception 
/*To use custom exception extends an Exception class(Parent)*/

@SuppressWarnings("serial")
public class LoginCredentials extends Exception{
	
	private String str;
	
	//getters and setters
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}



	//Parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	//ToString()
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	};
	
	
	
	
}
