package list;
import java.util.ArrayList;


public class BookStoreRunner {
	public static void main(String[] args) {
		OrderProcessor orderprocesser=new OrderProcessor();
        orderprocesser.getOrderFromTheCustomer();
        orderprocesser.getBookDataTheCustomer();
        orderprocesser.printOrderDetails(orderprocesser.BookList);
		
	}

}
