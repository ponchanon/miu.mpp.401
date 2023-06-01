package level1;

public class UPS extends ACarrier {
	static final double BASE_RATE = 0.45;
	private double weight;
	
	public UPS() {
		//
	}
	public UPS(String name, double weight) {
		super(name);
		this.weight = weight;
	}
	@Override
	//Rate = $0.45 * number of pounds
	public double calculateCost() {		
		return BASE_RATE * weight;		
	}

}
