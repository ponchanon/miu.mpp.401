package prob4;


public class Trailer extends Property{
	private static final double RENT = 500;
	Address address = super.getAddress();
	public Trailer(Address address) {
		super(address);
	}
	@Override
	public double computeRent(){
		return RENT;
	}
}
