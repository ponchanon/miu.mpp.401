package level3;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commissioned commission;
	
	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public int getOrdernum() {
		return orderNo;
	}
	public void setOrdernum(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
}
