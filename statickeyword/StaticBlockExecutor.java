//program to demonstrate static block
package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	String str;
    static float salary;
    /*static block is used to initialize static variable and 
     * we can't initialize any non static variable inside static block*/
    
    static
    {
    	salary=12000;
    	//str="BKC";
    }
    
    static void print()
    {
    	System.out.println("salary="+salary);
    }
    
    
	public static void main(String[] args) {
		/*main function is static and hence it calls static block, method and variable by default*/
	    
	    print();

	}

}
