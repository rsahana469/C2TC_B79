package org.tnsif.statickeyword;

public class StaticVariableExecutor {
	/* static variable=
	 * if any variable is outside the main function and if you want to access that variable inside main function
	 *  make it as static or create object of class and call using object name.variable name */
	
  static  String str="TNS India Foundation";

	public static void main(String[] args) {
		//StaticVariableExecuter s=new StaticVariableExecuter();
	       // System.out.println("String="+s.str);
			 System.out.println("String="+str);

	}

}
