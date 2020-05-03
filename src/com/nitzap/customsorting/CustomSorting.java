package com.nitzap.customsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSorting {

	
	public static void main(String[] args) {
//		String h1 = "helo";
//		System.out.println(h1.compareTo("abx"));
		
		Employee emp1 = new Employee(1,"Hibachi",2000000);
		Employee emp2 = new Employee(2,"Budh",50000000);
		Employee emp3 = new Employee(3,"Som",1000000);
		Employee emp4 = new Employee(4,"Mangal",600000);
		Employee emp5 = new Employee(5,"Brihaspati",7000000);
		
		List<Employee> empList =  new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		// sorting done using comparable implementation Employee
		System.out.println("sorting using comparable. Sorts by default by name");
 		Collections.sort(empList);
		
		empList.forEach(empl -> System.out.println(empl));

		//using comparator in Employee sort the employees by salary
		Collections.sort(empList, Employee.compareSalary);
		System.out.println("*****************************************************");
		System.out.println("sorting using comparator. sorts based on salary");
		empList.forEach(emp -> System.out.println(emp));
		
		
		//using comparator in Employee sort the employees by id
		Collections.sort(empList, Employee.compareId);
		System.out.println("*****************************************************");
		System.out.println("sorting using comparator. sorts based on Id");
		empList.forEach(emp -> System.out.println(emp));
		
		
		//Now let's say we want to use the comparator  to sort in descending order
		Comparator<Employee> reverseSortSalaryDescendingOrder = Collections.reverseOrder(Employee.compareSalary);
		Collections.sort(empList,reverseSortSalaryDescendingOrder );
		System.out.println("*****************************************************");
		System.out.println("Salary soreted in reverse order i.e. descending order using same comparator and Collections reverseOrder()");
		empList.forEach(empl -> System.out.println(empl));
		
		// Or we can reverse using the comparator's own reversed() method. Internally it calls reverseOrder() 
		Collections.sort(empList, Employee.compareSalary.reversed());
		
		
	}
}
