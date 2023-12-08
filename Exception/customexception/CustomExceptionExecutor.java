package org.tnsif.customexception;
//Program to demonstrate on custom exception
import java.util.Scanner;

public class CustomExceptionExecutor  {

	public static void main(String[] args) throws LoginCredentials {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String userid = s.nextLine();
		String password = s.nextLine();
		
		try
		{
			if(userid.equals("abc@gmail.com") && password.equals("Pass@123"))
			{
				System.out.println("Credentials are matched!");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials!!");
			}
		}
		catch(LoginCredentials l)
		{
			System.out.println("Exception handled: "+l);
		}
		
	}

}
