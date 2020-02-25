import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Book> list = new LinkedList<Book>();
		Scanner input = new Scanner(System.in);
		
		
		Book book = new Book("The Room", "Jane Do", 02, true);
		Book book2 = new Book("The hills", "Jannet Do", 432322, true);
		Book book3 = new Book("Ree", "Jame", 9231422, true);
		Book book4 = new Book("Thom", "JaDo", 7212, true);
		Book book5 = new Book("Toom", "Jano", 623, true);
			
		list.add(book);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		
	
		/*Iterator<Book> llIterator = list.iterator();
		while (llIterator.hasNext()) {
			System.out.println(llIterator.next());
		}*/
			
//		while(true)
//		{
//			//Add book to repository.  
////			@SuppressWarnings("resource")
////			
////			System.out.println("Please enter name of the Book: ");
////			String name = input.nextLine();
////			System.out.println("Please enter name of the Author: ");
////			String author = input.nextLine();
////			System.out.println("Please ISBN no: ");
////			long isbn = input.nextLong();
////			
////			Book bookAdd = new Book(name, author, isbn);
////			list.add(bookAdd);
			

		System.out.println(list.toString());
		
		//Remove book from repository. 	
		//algorithm - enter name, check names match , delete book , print list
		while(true){
		System.out.println("Enter the name of the book you want to delete");
		String name = input.nextLine();
		for(Book books: list) {
			if (name.equals(books.getTitle())) {
				list.remove(books);
				System.out.println(books.getTitle() + " Deleted Sucessfully");
				}
			else if (!name.equals(books.getTitle())) { 
				System.out.println("Book does not exist ");
			}		
		System.out.println(list);
			}
		}
//		if (name == llIterator.next().getAuthor()) {
//			llIterator.next().i
//			llIterator.remove();
//		}
//		System.out.println(list);
		
		
			
			//Mark book as available/unavailable. 
			//Add/Remove registered users. 

			
			
			
			//System.out.println(list);
		}
	//}

}
