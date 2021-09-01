package com.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CheckedExceptionDemo1 {

	public static void main(String[] args) throws IOException{

		Account a1 = new Account("demo_user", "user@demo.com");
		
		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//here we need to handle the exception FileNotFoundException and IOException
		//handled by using the throws keyword for IOException which is the parent exception
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Account a2 = (Account) ois.readObject(); // checkedException ClassNotFoundException
			System.out.println(a2);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception when trying to read Object "+ e);
		}
		
		oos.close();
		ois.close();
	}	

}
