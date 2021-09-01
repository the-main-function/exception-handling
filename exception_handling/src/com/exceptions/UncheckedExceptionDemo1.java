package com.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UncheckedExceptionDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		User u1 = new User("demo_user", "user@demo.com");
		
		FileOutputStream fos = new FileOutputStream("user.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u1);
		/*
		 here when trying to write object unchecked exception NotSerialiazableException will rise
		 since the User class is not implementing the serializable interface
		*/
		
		FileInputStream fis = new FileInputStream("user.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User u2 = (User) ois.readObject();
		System.out.println(u2);
		
		oos.close();
		ois.close();
	}	

}
