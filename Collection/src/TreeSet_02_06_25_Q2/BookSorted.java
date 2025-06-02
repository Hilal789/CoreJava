package TreeSet_02_06_25_Q2;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		TreeSet<Book> book = new TreeSet<Book>();
		
		book.add(new Book("Pride and Prejudice", "Jane Austen"));
		book.add(new Book("Alice's Adventures in Wonderland", "Lewis Carroll"));
		book.add(new Book("To Kill a Mockingbird","Harper Lee"));
		book.add(new Book("The Catcher in the Rye" ,"J.D. Salinger"));
		
		System.out.println("Display all the books sorted in alphabetial order.\r\n"
				+ "");
		book.forEach(System.out::println);

	}

}
