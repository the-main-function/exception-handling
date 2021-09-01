package com.exceptions;

public class UncheckedExceptionDemo2 {

	public static void main(String[] args){

		String name = null;
		System.out.println(name.substring(2));
		//operation being performed on a null object
		//at runtime NullPointerException
		
	}	

}
