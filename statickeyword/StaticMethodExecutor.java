package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	/*if any method outside the main function and if you want to access that method inside the main function make it as static */
	
	static float percentage=94;
	static void displayScore(int score)
	{
		/* we can't use non static variable inside static method */
		System.out.println(percentage);
		System.out.println("score="+score);
	}
	
	public static void main(String[] args) {
		displayScore(48);
	}

}
