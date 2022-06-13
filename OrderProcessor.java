package list;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class OrderProcessor {
	int bookCount;
	ArrayList<Book> BookList = new ArrayList<Book>(bookCount);

	Scanner scan = new Scanner(System.in);

	ArrayList<Book> getOrderFromTheCustomer() {
        	 int count;
        	System.out.println("Enter the Book Count");
        	int bookCount = scan.nextInt();
        	 for(int index=0;index<bookCount;index++) {
                 BookList.addAll(getOrderFromTheCustomer());
                 
					
                 }
        
        return BookList;
        }

	Book getBookDataTheCustomer() {

		int id, quantity;
		String name, author, publisher;

		System.out.println("Enter the id");
		id = scan.nextInt();
		System.out.println("Enter the Quantity");
		quantity = scan.nextInt();
		System.out.println("Enter the Name");
		name = scan.next();
		System.out.println("Enter the Author");
		author = scan.next();
		System.out.println("Enter the Publisher");
		publisher = scan.next();

		Book oBook = new Book(id, quantity, name, author, publisher);

		return oBook;

	}

	void printOrderDetails(ArrayList<Book> bookList) {

		ArrayList<Book> temp = new ArrayList<Book>(bookList);
		for (Book oBook : temp) {
			System.out.println("BOOK LIST");
			System.out.println(" id: " + oBook.id);
			System.out.println(" Quantity: " + oBook.quantity);
			System.out.println(" Name: " + oBook.name);
			System.out.println("publisher: " + oBook.publisher);
		}

	}
}
