package prob4c;

import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	List<Order>  orders;
	public Commissioned(int empId, double commission,double baseSalary, List<Order> orders) {
		super(empId);
		this.commission=commission;
		this.baseSalary=baseSalary;
		this.orders=orders;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Salary Information for employee with Employee ID: " + super.getEmpId());
		System.out.println("Employee Type: Commission Worker");
	}
	

	@Override
	public double calcGrossPay(int month, int year) {
		double totalValueOfOrders=0;
		double grosspay;
		for(Order o:orders)
		{
			totalValueOfOrders+=o.getOrderAmount();
		}
		return (totalValueOfOrders*commission)+baseSalary*(month+year*12);
		
	}}
