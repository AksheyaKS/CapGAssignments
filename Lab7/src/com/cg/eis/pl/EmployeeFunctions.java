package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeMenu;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;

public class EmployeeFunctions {
	
	private static IEmployeeService employeeService;
	private static Scanner s;

	public static void main(String[] args) {
		
		employeeService = new EmployeeServiceImpl();
		s = new Scanner(System.in);
		
		EmployeeMenu menu = null;
		
		while(menu != EmployeeMenu.QUIT) {
			
			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			
			for (EmployeeMenu m : EmployeeMenu.values()) {          //To access menu
				
				System.out.println(m.ordinal() + "\t" + m.name());
				
			}
			
			System.out.print("Enter your choice: ");
			int choice = -1;
			
			if (s.hasNextInt()) {
			
				choice = s.nextInt();
			} else {
				
				s.next();
				System.out.println("Please choose one of the following: ");
				continue;
			}

			if (choice < 0 || choice >= EmployeeMenu.values().length) {
				
				System.out.println("Invalid Choice");
				
			} else {
				
				menu = EmployeeMenu.values()[choice];
				
				switch (menu) {
				
				case ADD_EMPLOYEE:
					addEmployee();
					break;
					
				case LIST_EMPLOYEE_IS:
					listEmployee();
					break;
					
				case DELETE_EMPLOYEE:
					deleteEmployee();
					break;
					
				case QUIT:
					System.out.println("Successfully Exited!");
					break;
				}
			}

		}

		s.close();
			
	}
	
	public static void addEmployee() {
		
		System.out.println("Enter the id: ");
		int id = s.nextInt();
		System.out.println("Enter name of employee: ");
		String name = s.next();
		System.out.println("Enter the salary: ");
		int salary = s.nextInt();
		System.out.println("Enter the designation: ");
		String designation = s.next();
		System.out.println("Enter the insurance scheme: ");
		String is = s.next();
		
		Employee employee = new Employee(id,name,salary,designation,is);
		
		int emp_id = employeeService.add_employee(employee);
		
		System.out.println("The employee is created with id: " + emp_id);
		
	}
	
	public static void listEmployee() {
		
		System.out.println("Enter the insurance scheme: ");
		String is = s.next();
		
		Employee e = employeeService.list_employee_is(is);
		
		System.out.println("The employee is: " + e);
		
	}
	
	public static void deleteEmployee() {
		
		System.out.println("Enter the employee id: ");
		int id = s.nextInt();
		
		boolean flag = employeeService.remove_employee(id);
		
		if(flag) {
			
			System.out.println("Employee has been deleted");
		} else {
			
			System.out.println("Unsuccessful");
			
		}
		
	}

}
