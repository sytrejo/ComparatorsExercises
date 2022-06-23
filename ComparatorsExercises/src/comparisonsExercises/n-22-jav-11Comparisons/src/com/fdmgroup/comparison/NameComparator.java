package com.fdmgroup.comparison;

import java.util.Comparator;

import comparisonsExercises.Book;

public class NameComparator implements Comparator<Book> {

	@Override
	public int compareTo(Book b1, Book b2) {
			return b1.getNumberOfPages() - b2.getNumberOfPages();
		
	}

}
