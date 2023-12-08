package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(3422834);
		h.setAtmCardNo(53845);
		h.setPinNo(1212);
		
		//System.out.println("Account no.: "+h.getAccountNo());                  By this line we can call a single data 
		
		//below line will call to toString() method
		System.out.println(h);
	}

}
