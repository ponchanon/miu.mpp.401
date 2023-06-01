package prog1;

public class Product implements IProduct{
	private String productNumber;
	private String description;	
	private double price;
	private ACompPoints compPoints;
	
	public Product(String productNumber,String description, double price, ACompPoints compPoints) {
		super();
		this.description = description;
		this.productNumber = productNumber;
		this.price = price;
		this.compPoints = compPoints;
	}
	public String toString() {
		String output = "";
		output += productNumber + "-" + description + "   " + "$"+ price + "   " + compPoints.getPoints() + "pts" + "\n";
		return output;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public ACompPoints getCompPoints() {
		return compPoints;
	}

	public void setCompPoints(ACompPoints compPoints) {
		this.compPoints = compPoints;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	

}
