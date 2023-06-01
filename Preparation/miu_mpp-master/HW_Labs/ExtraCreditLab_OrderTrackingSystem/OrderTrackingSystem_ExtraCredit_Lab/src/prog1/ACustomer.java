package prog1;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer {
	private String name;
	private String address;
	private String phone;
	private double points;
	private List<Order> orderList;
	
	public ACustomer(String name, String address, String phone, double points) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.points = points;
		this.orderList = new ArrayList<Order>();
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void addOrder(Order o) {
		this.orderList.add(o);
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public abstract String getCreditRating();
}
