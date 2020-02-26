
public class Book {

	private String Title;
	private String Author;
	private long Isbn;
	private boolean Availability;
	
	public Book() { //default constructor
//		Title = "First Book";
//		Author ="John Doe";
//		Isbn = 01;
	}
	
	public Book(String title, String author, long isbn, boolean availability) {
		this.Title = title;
		this.Author = author;
		this.Isbn = isbn;
		this.Availability = availability;
	}
	
	@Override
	public String toString() {
//		Book[] arr;
//		for(int i = 0; i < arr .length; i++)
//		{
//		   for(int j = 0; j < arr[0].length; j++)
//		   {
//		      System.out.printf("%s ", arr[i][j]);
//		   }
//		   System.out.println();
//		}
		String result = String.format("Book: Title=%s, Author=%s, Isbn=%s, Available=%s"+ "\n", Title, Author, Isbn, Availability);

		return result;	}

	//Getters
	public String getAuthor() {
		return Author;
	}
	public String getTitle() {
		return Title;
	}
	public long getIsbn() {
		return Isbn;
	}
	public boolean isAvailability() {
		return Availability;
	}

	//Setters
	public void setAvailability(boolean availability) {
		Availability = availability;
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
