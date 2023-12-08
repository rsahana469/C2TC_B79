//program to demonstrate on: 
//this keyword is used to refer current instance of the class
package org.tnsif.thiskeyworddemo;

class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	
	void display()
	{
		System.out.println(accountNo);
		//return accountNo;
	}
}

public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account a = new Account();
		//a.accountNo=233254546765L;
		a.setData(233254546765L);
		a.display();
		//System.out.println(a.display(233254546765L));
		
	}

}
