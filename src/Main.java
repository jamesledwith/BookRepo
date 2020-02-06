import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		while(true)
		{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter name of the Book: ");
			String name = input.nextLine();
			System.out.println("Please enter name of the Author: ");
			String author = input.nextLine();
			System.out.println("Please ISBN no: ");
			long isbn = input.nextLong();
			

			Book book = new Book(name, author, isbn);
			
			Book book2 = new Book("The Room", "Jane Do", 02);
			LinkedList<Object> list = new LinkedList<>();
			list.add(book);
			list.add(book2);
			
			System.out.println(list);
		}
	}

}
