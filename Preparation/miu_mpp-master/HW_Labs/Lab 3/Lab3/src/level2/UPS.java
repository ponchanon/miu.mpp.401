package level2;

public class UPS extends ACarrier {
	static final double BASE_RATE = 0.45;
	private double weight;
	
	public UPS() {
		//
	}
	public UPS(DiscountType dt, String name, double weight ) {
		super(dt, name);
		this.weight = weight;
	}
	@Override
	//Rate = $0.45 * number of pounds
	public double calculateCost() {	
		double baseCost =  BASE_RATE * weight;
		if(super.discountType == DiscountType.STUDENT) {
			return baseCost - (baseCost* 0.1);
		}else if(super.discountType == DiscountType.SENIOR) {
			return baseCost - (baseCost* 0.15);
		}else {
			return baseCost;
		}				
	}

}
