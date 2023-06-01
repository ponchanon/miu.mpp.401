package level1;

public class USMail extends ACarrier {
	
	static final double LESS_3_POUNDS_RATE = 1.00;
	static final double GREATER_3_POUNDS_RATE = 0.55;
	private double weight;

	public USMail(String name, double weight) {
		super(name);
		this.weight = weight;
	}
	@Override
	public double calculateCost() {		
		if(weight <= 3.00) return LESS_3_POUNDS_RATE;
		else return weight * GREATER_3_POUNDS_RATE;
	}
	

}
