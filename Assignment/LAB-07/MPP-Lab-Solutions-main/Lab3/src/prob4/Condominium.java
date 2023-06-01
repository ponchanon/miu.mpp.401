package prob4;



public class Condominium extends Property{
	private int numberOfFloors;
	public Condominium(Address address, int numberOfFloors) {
		super(address);
		this.numberOfFloors = numberOfFloors;
	}
	@Override
	public double computeRent(){
		return 400 * numberOfFloors;
	}
}
