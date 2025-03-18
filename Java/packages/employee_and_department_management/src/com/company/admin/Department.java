package com.company.admin;

public class Department {
	private String deptName;
	private int deptId;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	
	public String showDepartmentDetails(){
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	

}
