package prob3b;

public class Cylinder {
	private double height;
	private double radius;

	Cylinder(double height, double radius) {
		this.radius = radius;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double computeVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

}
