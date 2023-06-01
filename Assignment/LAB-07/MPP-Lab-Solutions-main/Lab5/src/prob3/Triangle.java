package prob3;



public final class Triangle implements ClosedCurve {
	final private double base;
	final private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return 0.5 * base * height;
	}
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}

}
