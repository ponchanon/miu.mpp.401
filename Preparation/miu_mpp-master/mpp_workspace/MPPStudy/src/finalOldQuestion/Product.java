package finalOldQuestion;

public class Product {
	private String productID;
	private String description;
	private String manufacturer;
	private double price;
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String productID, String description, String manufacturer, double price) {
		super();
		this.productID = productID;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	// return a String containing the Employee's information
	   @Override
	   public String toString() 
	   {
	      return String.format("%-8s %-8s %-8s %.2f", 
	         getProductID(), getDescription(), getManufacturer(), getPrice());
	   } // end method toString
	
	@Override
	public boolean equals(Object o)
	{
		if(o== null) return false;
		if(!(o instanceof Product)) return false;
		Product p1 = (Product) o;
		return p1.getProductID().equals(productID) 
				&& p1.getDescription().equals(description)
				&& p1.getManufacturer().equals(manufacturer) 
				&& p1.getPrice() == price;
	}

}
