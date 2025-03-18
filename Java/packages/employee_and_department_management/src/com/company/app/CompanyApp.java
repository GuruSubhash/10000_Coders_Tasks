package com.company.app;

import com.company.admin.*;
import com.company.hr.*;
public class CompanyApp {

	public static void main(String[] args) {
		Department dpt= new Department();
		dpt.setDeptId(05);
		dpt.setDeptName("CSE");
		
		Employee emp = new Employee();
		emp.setId(666);
		emp.setName("Guru Subhash");
		emp.setSalary(2^31-1);
		
		System.out.println(dpt.showDepartmentDetails());
		System.out.println("--------------------------------------");
		System.out.println(emp.showEmployeeDetails());

	}

}
