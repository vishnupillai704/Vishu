package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
	@GeneratedValue
	private Long employeeid;
	private String employeename;
	private String employeedepartment;
	private String employeedesignation;
	private Integer employeesalary;
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeedepartment() {
		return employeedepartment;
	}
	public void setEmployeedepartment(String employeedepartment) {
		this.employeedepartment = employeedepartment;
	}
	public String getEmployeedesignation() {
		return employeedesignation;
	}
	public void setEmployeedesignation(String employeedesignation) {
		this.employeedesignation = employeedesignation;
	}
	public Integer getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(Integer employeesalary) {
		this.employeesalary = employeesalary;
	}

}
