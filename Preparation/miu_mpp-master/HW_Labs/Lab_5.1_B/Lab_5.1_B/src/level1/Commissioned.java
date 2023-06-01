package level1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	
	private double commission = 0.07;
	private double baseSalary;
	private List<Order> orderList = new ArrayList<Order>();
	
	public Commissioned(String id, double commission, double baseSalary, List<Order> orderList) {
		super(id);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orderList = orderList;
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	//A simpler version would be sufficient where we just sum up the amounts of all orders irrespective of the order date. 
	//Don't spend much time on date manipulation!
	//Level 1 - all orders will be added to total amount
	@Override
	public double calcGrossPay(int month, int year) {
		double totalOrderAmt = 0.0;			
		for(Order o : orderList) {
			//System.out.println("orderNo:" + o.getOrdernum());			
			totalOrderAmt += o.getOrderAmount();			
			
		}		
		return baseSalary + (commission * totalOrderAmt);
		
	}
	
}
