package com.nitzap.customsorting;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	


	private int empId;
	private String empName;
	private long salary;
	
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee emp) {
		// Here we are checking if this.employee has a name of higher order thant the incoming emp value
		//we can also check using the empId if we need as below:
		//return this.empId-emp.empId;
		return this.empName.compareTo(emp.empName);
	}
	
	
	@Override
	public String toString() {
		
		return ("EmpName: "+this.empName+" with Id: "+this.empId+" with salary: "+this.salary);
	}
	
	public static Comparator<Employee> compareSalary = ( employee1,  employee2) -> {
		if((employee1.getSalary()-employee2.getSalary())>1) {
			return 1;
		}else if((employee1.getSalary()-employee2.getSalary())<1){
			return -1;
		}else {
			return 0;
		}
		
	};
	
	public static Comparator<Employee> compareId = (employee1, employee2) -> employee1.getEmpId()-employee2.getEmpId();
	
	
	public static Comparator<Employee> compareName = (employee1, employee2)->employee1.getEmpName().compareTo(employee2.getEmpName());
	

}
