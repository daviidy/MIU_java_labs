package final_practice;

import java.util.Objects;

public class Book implements Cloneable {
	String isbn;
	String author;
	double cost;
	Publisher publisher;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book) || obj == null) {
			return false;
		}
		Book b = (Book) obj;
		return isbn.equals(b.getIsbn())
				&& author.equals(b.getAuthor())
				&& cost == b.getCost()
				&& publisher.equals(b.getPublisher());
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", cost=" + cost + ", publisher=" + publisher + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Book copy = (Book)super.clone();
		copy.setPublisher((Publisher) copy.getPublisher().clone());
		return copy;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(
					isbn,
					author,
					cost,
					publisher
				);		
	}
}
