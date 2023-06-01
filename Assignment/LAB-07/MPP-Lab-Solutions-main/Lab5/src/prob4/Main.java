package prob4;

import java.time.LocalDate;
public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.newItem("Pen"));
		order.addItem(CustOrderFactory.newItem("Book"));

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.newItem("Keyboard"));
		order.addItem(CustOrderFactory.newItem("Mouse"));

		System.out.println(cust.getOrders());
	}
}

		
