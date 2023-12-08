//Program to demonstrate on Encapsulation 
/*Encapsulation Achieves data hiding using private access specifiers*/
package org.tnsif.encapsulation;

public class HDFC {
	
	//Private data members
	private String accType;
	private long accountNo;
	private long atmCardNo;
	private int PinNo;
	
	//getters and setters
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return PinNo;
	}
	public void setPinNo(int pinNo) {
		PinNo = pinNo;
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", PinNo=" + PinNo
				+ "]";
	}
	
	
	

}
