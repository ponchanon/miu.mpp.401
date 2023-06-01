package prob4c;

import java.time.LocalDate;
import java.util.Date;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
	
}
