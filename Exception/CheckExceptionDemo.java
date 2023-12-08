package org.tnsif.checkexception;
//Program to demonstrate on 
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionDemo {

	public static void main(String[] args) {
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream f = new FileInputStream("C:\\Users\\sigma\\OneDrive\\Documents\\TNS\\DAY-01\\day9.txt");
			System.out.println("File is exists!!");
		} catch (FileNotFoundException e) {
			
			System.out.println("Exception Handled: "+e);
		}

	}

}
