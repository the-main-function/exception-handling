package com.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) throws InterruptedException{

		System.out.println("***Checked Exception ***");
		
		Thread.sleep(5000);
		//Interrupted Exception to be handled in this case
		
		System.out.println("************");
		
	}	

}
