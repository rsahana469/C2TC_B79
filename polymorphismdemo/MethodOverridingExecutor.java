package org.tnsif.polymorphismdemo;

class ChiefMinister
{
	static void corruption(String str1, float amt)
	{
		System.out.println(str1+ "'s corrupted amount is: "+amt);
	}
	
}

class MLA extends ChiefMinister
{
	
	static void corruption(String str1, float amt)
	{
		ChiefMinister.corruption("aaa",45000);
		//super.corruption("Tamanna", 2345);
		
		System.out.println(str1+ "'s corrupted amount is: "+amt);
	}
	
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		//MLA mla = new MLA();
		MLA.corruption("bbb",34980);

	}

}
