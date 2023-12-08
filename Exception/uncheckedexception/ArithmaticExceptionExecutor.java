package org.tnsif.uncheckedexception;
//Program to demonstrate on Exception handling using try-catch block
import java.util.Scanner;
public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		//try block contains an exception code
		try
		{
			System.out.println(x/y);
		}
		//catch block is used to handle the exception
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
		}
		s.close();
		
	}

}
