package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	private HashMap <Integer,Employee> employees;
	
	@Override
	public int add_employee(Employee employee) {
		
		int id;
		if(employee != null) {
			
			id = employee.getId();
			employees.put(id, employee);
			
		}
		
		return employee.getId();
		
	}
	
	@Override
	public Employee list_employee_is(String insuranceScheme) {
		
		return employees.get(insuranceScheme);
		
	}
	
	@Override
	public boolean remove_employee(int id) {
		
		boolean flag = false;
		
		if(id != 0) {
			
			employees.remove(id);
			flag = true;
			
		}
		
		return flag;
		
	}

}
