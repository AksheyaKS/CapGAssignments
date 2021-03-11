package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String designation;
	private  String insuranceScheme;
	
	public Employee() {
		
		/*No implementation*/
		
	}

	public Employee(int id, String name, int salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesination(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, salary=%s, designation=%s, insuranceScheme=%s]", id, name,
				salary, designation, insuranceScheme);
	}

}
