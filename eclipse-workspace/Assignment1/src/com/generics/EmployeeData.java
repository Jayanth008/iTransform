package com.generics;
import java.util.HashSet;
class Employee{
	int id;
	String name;
	int salary;
	String department;
	public Employee(int id, String name, int salary, String department) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}

public class EmployeeData {

	public static void main(String[] args) {
		HashSet<Employee> EmployeeData = new HashSet<>();
		EmployeeData.add(new Employee(1,"venky",300000,"AnalystA4"));
		EmployeeData.add(new Employee(2,"Sai",300000,"AnalystA4"));
		EmployeeData.add(new Employee(3,"papa",300000,"AnalystA4"));
		
	    for(Employee e:EmployeeData) {
	    	System.out.println(e);
	    }
		

	}

}
