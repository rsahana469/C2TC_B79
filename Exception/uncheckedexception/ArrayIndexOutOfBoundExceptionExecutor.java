package org.tnsif.uncheckedexception;
//Program to demonstrate on ArrayIndexOutOfBoundException with finally
public class ArrayIndexOutOfBoundExceptionExecutor {

	static void display(int arr[])
	{
		try 
		{
	        System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled: "+e);
		}
		finally
		{
			System.out.println("Finally block always executed");
		}
		System.out.println("Any statement outside the try, catch and finally the it always executed");
	}
	
	public static void main(String[] args) {
		int arr[]= {12, 3,5};
		display(arr);

	}

}
