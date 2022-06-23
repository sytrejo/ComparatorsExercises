package comparisonsExercises;

import java.util.Comparator;

public class BookRatingPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getRating() > b2.getRating()) {
			return -1;
		} else if (b1.getRating() < b2.getRating()) {
			return 1;
		} else {
			if(b1.getPrice() < b2.getPrice()) {
				return -1;
			} else if( b1.getPrice() > b2.getPrice() ) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
