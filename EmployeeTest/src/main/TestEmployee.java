package main;

import entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Set employee obj");
		Employee emp1 = new Employee();
		emp1.setName("Sonal");
		emp1.setAge(21);
		emp1.setAdd("pune");
		emp1.setEmpId(101);
		System.out.println("Get Employee 1 details:");
		System.out.println("Employee Name: " + emp1.getName());
		System.out.println("Employee address : " + emp1.getAdd());
		System.out.println("Employee ID: " + emp1.getEmpId());
	}
}
