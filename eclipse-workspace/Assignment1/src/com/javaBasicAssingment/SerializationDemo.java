package com.javaBasicAssingment;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int num;
	public Employee(String name, int num) {
		
		this.name = name;
		this.num = num;
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = new Employee("venky",123);
		try {
			FileOutputStream Fi = new FileOutputStream("C:\\Users\\Mr.venky\\eclipse-workspace\\venkyrock.txt");
			ObjectOutputStream Os = new ObjectOutputStream(Fi);
			Os.writeObject(emp);
			Os.close();
			Fi.close();
			System.out.println("Sucess");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("FileNotFOund");
		}
		

	}

}
