package level2_no6_redo_lab3_level2;

public class USMail extends ACarrier {
	
	static final double LESS_3_POUNDS_RATE = 1.00;
	static final double GREATER_3_POUNDS_RATE = 0.55;
	private double weight;

	public USMail(DiscountType dt, String name, double weight) {
		super(dt, name);
		this.weight = weight;
	}
	@Override
	public double calculateCost() {
		double baseCost;		
		if(weight <= 3.00) {
			baseCost = LESS_3_POUNDS_RATE;
		}
		else {
			baseCost = weight * GREATER_3_POUNDS_RATE;
		}
		//		
		if(super.discountType == DiscountType.STUDENT) {
			return baseCost - (baseCost * 0.1);
		}else if(super.discountType == DiscountType.SENIOR) {
			return baseCost - (baseCost * 0.15);
		}else {
			return baseCost;
		}	
	}
	

}
