package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	
	int add_employee(Employee employee);
	Employee list_employee_is(String insuranceScheme);
	boolean remove_employee(int id);

}
