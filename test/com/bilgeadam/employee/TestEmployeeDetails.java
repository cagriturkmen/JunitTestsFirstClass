package com.bilgeadam.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmployeeDetails {
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	@Test
	void testCalculateBonus() {
	
		employee.setName("Cagri");
		employee.setAge(30);
		employee.setMonthlySalary(10001);
		
		assertEquals(1000, empBusinessLogic.calculateBonus(employee));
		assertEquals("Cagri", employee.getName());
		assertEquals(30, employee.getAge());
		
		
	}
	@Test
	void testCalculateYearlySalary() {
		employee.setName("Cagri");
		employee.setAge(30);
		employee.setMonthlySalary(10001);
		
		assertEquals(120012, empBusinessLogic.calculateYearlySalary(employee));
		
	}
	

}
