//Program to demonstrate instance of operator
package org.tnsif.instanceofdemo;
class 	RBI
{
	 String ifscCode;
}
class SBI extends RBI
{
	
	public SBI() {
		super.ifscCode="RBISONGPA01";
		String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		
		/*If parent class and child class variable name are same,
		 * in such case, use super.variablename to access it into child class
		 * Same as in case method names are same the to access it use super.methodname*/
		System.out.println(super.ifscCode);
	} 
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
