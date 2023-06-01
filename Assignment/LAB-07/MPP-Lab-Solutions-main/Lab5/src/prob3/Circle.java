package prob3;


public final class Circle implements ClosedCurve {
	final private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		double area = Math.PI * radius * radius; 
		return area;
	}
	
	
	public double getradius() {
		return radius;
	}
}
