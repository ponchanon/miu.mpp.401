package prob3a;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(0, radius);
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(super.getRadius(), 2);
	}

}
