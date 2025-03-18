package com.library.app;

import com.library.books.*;
import com.library.staff.*;

public class LibraryApp {

	public static void main(String[] args) {
		Library lib= new Library();
		lib.setLibraryName("Digital Library");
		lib.setTotalBooks(666);
		
		
		Librarian lbrn = new Librarian();
		lbrn.setLibrarianName("Book Keeper");
		lbrn.setYearsOfExperience(6);
		
		System.out.println(lib.showLibraryDetails());
		System.out.println("-------------------------------------------------");
		System.out.println(lbrn.showLibrarianInfo());
	}
}
