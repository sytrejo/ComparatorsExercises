package comparisonsExercises;

import java.util.Comparator;

public class BookPagesIsbnComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getNumberOfPages() < b2.getNumberOfPages()) {
			return -1;
		} else if(b1.getNumberOfPages() > b2.getNumberOfPages()) {
			return 1;
		} else {
			return b2.getIsbn() - b1.getIsbn();
		}
	}
	
	

}
