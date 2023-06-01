package level2_no6_redo_lab3_level2;

public class FedEx extends ACarrier {
	private double weight;
	private Zone zone;
//	static final double RATE1 = 0.30;//for TX, and UT
//	static final double RATE2 = 0.35;//for IA, MT, OR and CA
//	static final double RATE3 = 0.43;//for all others
//	static final double RATE4 = 0.55;//for FL, MA and OH

	public FedEx(DiscountType dt, String name, double weight, Zone zone) {
		super(dt, name);
		this.weight = weight;
		this.zone = zone;
	}
	@Override
	public double calculateCost() {
		double zoneRate;
		if(zone.equals(Zone.TX) || zone.equals(Zone.UT)) zoneRate = 0.30;
		else if(zone.equals(Zone.IA) || zone.equals(Zone.MT) || zone.equals(Zone.OR) || zone.equals(Zone.CA)) zoneRate = 0.35;
		else if(zone.equals(Zone.FL) || zone.equals(Zone.MA) || zone.equals(Zone.OH)) zoneRate = 0.55;
		else zoneRate = 0.43;
		//System.out.println("zoneRate: " + zoneRate);
		double baseCost = zoneRate * weight;
		if(super.discountType == DiscountType.STUDENT) {
			return baseCost - (baseCost * 0.1);
		}else if(super.discountType == DiscountType.SENIOR) {
			return baseCost - (baseCost* 0.15);
		}else {
			return baseCost;
		}	
	}
	
	
}
