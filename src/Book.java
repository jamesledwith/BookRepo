import java.util.LinkedList;
import java.util.Scanner;

public class Book {

	private String Title;
	private String Author;
	private long Isbn;
	
	public Book() { //default constructor
		Title = "First Book";
		Author ="John Doe";
		Isbn = 01;
	}
	
	public Book(String title, String author, long isbn) {
		this.Title = title;
		this.Author = author;
		this.Isbn = isbn;
	}
	
	@Override
	public String toString() {
		return String.format("Book: Title=%s, Author=%s, Isbn=%s \n", Title, Author, Isbn);
	}

	public String getAuthor() {
		return Author;
	}
	public String getTitle() {
		return Title;
	}
	public long getIsbn() {
		return Isbn;
	}
	
	
	public void setTitle(String title) {
		Title = title;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public void setIsbn(long isbn) {
		Isbn = isbn;
	}	
	
}
