package com.library.books;

public class Library {

	private  int totalBooks;
	private String libraryName;
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String showLibraryDetails(){
		return "Library [totalBooks=" + totalBooks + ", libraryName=" + libraryName + "]";
	}
	
}
