package main;

import entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Set employee obj");
		Employee emp1 = new Employee();
		emp1.setName("Sonal");
		emp1.setAge(21);
		System.out.println("Get Employee 1 details:");
		System.out.println("Employee Name: " + emp1.getName());
	}
}
