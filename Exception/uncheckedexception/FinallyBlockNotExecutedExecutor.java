package org.tnsif.uncheckedexception;
//Program to demonstrate on when finally block is not executed
public class FinallyBlockNotExecutedExecutor {
	
	static void display(int arr[])
	{
		try 
		{
	        System.out.println(arr[3]);
	        /*1.If try and catch block contains a system.exit(0);
	         * after the exception code line, then finally block is not executed*/
	        //System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
			//System.exit(0);
		}
		finally
		{
			/*When finally block contains exception code, then finally block does not execute*/
			System.out.println(13/0);
			System.out.println("Finally block always executed");
		}
		System.out.println("Any statement outside the try, catch and finally the it always executed");
	}

	public static void main(String[] args) {
		int arr[]= {12, 3,5};
		display(arr);

	}

}
