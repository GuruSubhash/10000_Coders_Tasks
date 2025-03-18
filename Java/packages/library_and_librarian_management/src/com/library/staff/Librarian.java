package com.library.staff;

public class Librarian {

	private String librarianName;
	private int yearsOfExperience;
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String showLibrarianInfo() {
		return "Librarian [librarianName=" + librarianName + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
}
