package comparisonsExercises;



public class BookPagesComparator implements Comparable<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return b1.getNumberOfPages() - (b2.getNumberOfPages());
	}



}
