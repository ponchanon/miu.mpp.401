package level2;

public abstract class ACarrier implements ICarrier{
	
	private String itemName;
	protected DiscountType discountType = null;
	
	public ACarrier() {
		
	}
	public String getItemName() {
		return itemName;
	}
	public ACarrier(DiscountType dt, String name ) {
		this.itemName = name;
		this.discountType = dt;
	}	
	public abstract double calculateCost();
}
