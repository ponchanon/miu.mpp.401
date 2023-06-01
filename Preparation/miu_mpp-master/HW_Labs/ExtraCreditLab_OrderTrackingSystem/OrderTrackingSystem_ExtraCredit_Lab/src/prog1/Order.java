package prog1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private String ordernumber;
	private boolean prepaid;
	private double orderprice;
	private LocalDate orderdate;
	private String status;
	private ACustomer customer;
	private List<Orderline> orderLineList;
	
	public Order(String ordernumber, LocalDate orderdate, String status, ACustomer customer) {
		super();
		this.ordernumber = ordernumber;		
		this.orderdate = orderdate;
		this.status = status;
		this.customer = customer;		
		orderLineList = new ArrayList<Orderline>();
	}
	//for bill record
	public Order(String ordernumber, LocalDate orderdate, double total) {
		this.ordernumber = ordernumber;	
		this.orderdate = orderdate;
		this.orderprice = total;
	}
	
	public String getOrdernumber() {
		return ordernumber;
	}


	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}


	public double getOrderprice() {
		return orderprice;
	}


	public void setOrderprice(double orderprice) {
		this.orderprice = orderprice;
	}


	public LocalDate getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public ACustomer getCustomer() {
		return customer;
	}


	public void setCustomer(ACustomer customer) {
		this.customer = customer;
	}


	public List<Orderline> getOrderLineList() {
		return orderLineList;
	}
	
	
	public void addOrderLine(Orderline l) {
		orderLineList.add(l);
		orderprice = orderLineList.stream().mapToDouble(Orderline::computePrice).sum();
		if(customer.getCreditRating().equals("poor")) {
			this.prepaid = true;
		}else if(!(customer.getCreditRating().equals("poor")) && ((CorporateCust)customer).getCreditLimit() < orderprice)
		{
			this.prepaid= true;
		}else {
			this.prepaid = false;
		}	
	}


	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
	
	public String toString() {
		String output = "";
		output += "Date: " + orderdate + "\n";
		output += "Status: " + status + "\n";
		output += "Ordernumber: " + ordernumber + "\n";
		output += "Customer: " + customer.getName() +  "\n";
		output += "Prepaid: " + prepaid +  "\n";
		output += "Order Price: " + "$" +orderprice + "\n";
		output += "Accu Points: " + customer.getPoints() + "\n";
		output += "Claim Points: " + (customer.getPoints()>= 25 ? "25.00" : "0.00")  + "\n";
		output += "Discount Applied: " + (customer.getPoints()>= 25 ? "40%" : "0.00")  + "\n";
		output += "Total Price: " + "$" + getTotalPrice() + "\n";
		
		return output;
	}

	//accumulated points means collected from previous order
	//current order points will not add in current transaction 
	public double getTotalPrice() {		
		double total = orderLineList.stream().mapToDouble(Orderline::computePrice).sum();
		if(getCustomerPoints() >= 25) {
			total = total - (total*0.4);
			if(!getPrepaid()) {
				if(customer instanceof CorporateCust) {//have to record like screenshot for bill generating, if not after points have been deducted, retrieving bill from order obj and customer obj again will not reflect the actual amount paid during transaction
					Order recordOrd = new Order(this.ordernumber, this.getOrderdate(), total);
					((CorporateCust)customer).addBillRecord(recordOrd);
				}
			}
			
			setCustomerPoints(-25.00);
		}
		return total;
	}
	
	public boolean getPrepaid() {//if customer credit rating poor & credit-card info have -> prepaid works		
		return prepaid;
	}
	public double getCustomerPoints() {
		return customer.getPoints();
	}
	//current order points will not accumulate until transaction paid.
	public double getOrderPoints() {
		double ttPoints = orderLineList.stream().mapToDouble(Orderline::computePoints).sum();
		
		return ttPoints;
	}
	public void setCustomerPoints(double pts) {
		customer.setPoints(customer.getPoints() + pts);
	}
}