package comparisonsExercises;



public class Book implements Comparable<Book>{
	

	private String title;
	private int isbn;
	private double price;
	private int numberOfPages;
	private double rating;
	
	public Book(String title, int isbn, double price, int numberOfPages, double rating) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + ", numberOfPages=" + numberOfPages
				+ ", rating=" + rating + "]";
	}
	
	
	public Book compareTo(Book b1, Book b2) {
		
		if(b1.getNumberOfPages() > b2.getNumberOfPages()) {
			return b1;
		} else if(b1.getNumberOfPages() < b2.getNumberOfPages()) {
			return b2;
		} else {
			return null;
		} 
	}

	public int compare(Book o, Book j) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
}
