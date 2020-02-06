import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		while(true)
		{
			//Add book to repository.  
			/*@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter name of the Book: ");
			String name = input.nextLine();
			System.out.println("Please enter name of the Author: ");
			String author = input.nextLine();
			System.out.println("Please ISBN no: ");
			long isbn = input.nextLong();*/
			
			//Remove book from repository.  
			
			
			
			//Mark book as available/unavailable. 
			//Add/Remove registered users. 

			Book bookAdd = new Book(name, author, isbn);
			Book book = new Book("The Room", "Jane Do", 02);
			
			LinkedList<Object> list = new LinkedList<>();
			list.add(bookAdd);
			list.add(book);
			
			System.out.println(list);
		}
	}

}
