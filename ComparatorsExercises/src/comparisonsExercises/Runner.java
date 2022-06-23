package comparisonsExercises;

import java.util.*;

public class Runner {
	
	public static void main(String[] args) {
		
		
		
		Book book1 = new Book("Learn JAVA", 45678, 19.99, 500, 4.3);
		Book book2 = new Book("Learn UniX", 65432, 17.5, 650, 3.9);
		Book book3 = new Book("Learn SQL", 87956, 9.75, 220, 4.44);
		Book book4 = new Book("Learn Agile", 35367, 25.5, 500, 4.4);
		Book book5 = new Book("Learn React", 55676, 28.75, 490, 4.8);
		Book book6 = new Book("Learn JavaScript", 34343, 14.99, 300, 4.4);
		Book book7 = new Book("Learn Python", 65767, 27.25, 500, 4.1);
		
		
		ArrayList<Book> programmingBooks = new ArrayList<>();
		
		programmingBooks.add(book1);
		programmingBooks.add(book2);
		programmingBooks.add(book3);
		programmingBooks.add(book4);
		programmingBooks.add(book5);
		programmingBooks.add(book6);
		programmingBooks.add(book7);
		
		
		//print out the list using a for loop
		System.out.println("Programming Books List:" );
		for(Book book : programmingBooks) {
			System.out.println(book);
		}
		
		
		System.out.println("\n*************BookNameComparator*******");
		System.out.println("Sort by name in ascending order:");
		Collections.sort(programmingBooks, new BookNameComparator());
		for(Book book : programmingBooks) {
			System.out.println(book);
		}
		
		
		System.out.println("\n*************BookPagesIsbnComparator*******");
		System.out.println("Sort by name in ascending order:");
		Collections.sort(programmingBooks, new BookPagesIsbnComparator());
		for(Book book : programmingBooks) {
			System.out.println(book);
		}
		
		System.out.println("\n*************BookPriceComparator*******");
		System.out.println("Sort by name in ascending order:");
		Collections.sort(programmingBooks, new BookPriceComparator());
		for(Book book : programmingBooks) {
			System.out.println(book);
		}
		

		
		System.out.println("\n*************BookRatingPriceComparator*******");
		System.out.println("Sort by name in ascending order:");
		Collections.sort(programmingBooks, new BookRatingPriceComparator());
		for(Book book : programmingBooks) {
			System.out.println(book);
		}
		
	
		TreeSet<Book> programmingBookSet = new TreeSet<>(new BookRatingPriceComparator());
		
		programmingBookSet.add(book1);
		programmingBookSet.add(book2);
		programmingBookSet.add(book3);
		programmingBookSet.add(book4);
		programmingBookSet.add(book5);
		programmingBookSet.add(book6);
		programmingBookSet.add(book7);
		
		for(Book book : programmingBookSet) {
			System.out.println(book);
		}
		
		
		System.out.println("\n************* Priority Queu in Decending Order***********");
		
		double[] values = {12, 45.75, 5.16, 3.14, 2, 9.12, 9.75, 33, 13.50};
		
		PriorityQueue<Double> bookPriorityQueue = reverseOrderPQ(values);
		
		
	}

	private static PriorityQueue<Double> reverseOrderPQ(double... values) {
		PriorityQueue<Double> bookPriorityQueue = new PriorityQueue<>(values.length, Collections.reverseOrder());
		
		for( double d : values) {
			bookPriorityQueue.add(d);
		}
		
		return bookPriorityQueue;
	}

}
