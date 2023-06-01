package level1;

public abstract class ACarrier implements ICarrier{
	
	private String itemName;
	
	public ACarrier() {
		
	}
	public String getItemName() {
		return itemName;
	}
	public ACarrier(String name) {
		this.itemName = name;
	}	
	public abstract double calculateCost();
}
