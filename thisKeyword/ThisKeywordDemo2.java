//program to demonstrate on: 
//this keyword can be passed as argument inside constructor call
package org.tnsif.thiskeyworddemo;

class Bank
{
	long accountNo;
	
	Bank(long accountNo)
	{
		this.accountNo=accountNo;
		//System.out.println(accountNo);
	}
	
	void display()
	{
		System.out.println(accountNo);
		//return accountNo;
	}
}


public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b = new Bank(32435946750L);
		b.display();

	}

}
