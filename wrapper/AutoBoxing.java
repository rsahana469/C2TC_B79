package org.tnsif.wrapperclass;
//Program to demonstrate on autoboxing
/*AutoBoxing: Conversion of primitive datatypes into object type*/
public class AutoBoxing {

	public static void main(String[] args) {
		int num=97;
		//Converting primitive datatypes into object type
		Integer value = num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
