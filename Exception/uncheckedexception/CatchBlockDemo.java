package org.tnsif.uncheckedexception;
//Program to demonstrate on catch block with multiple exception class
public class CatchBlockDemo {
	
	static void print (int arr[])
	{
		try 
		{
			System.out.println(arr[3]);
		}
		//We can use multiple catch block in a program
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled :"+e);
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {12,3,14};
		print(arr);

	}

}
